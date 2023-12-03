from flask_app import app
from flask import render_template, redirect, request, session, flash
from flask_app.models.user import User
from flask_bcrypt import Bcrypt


bcrypt = Bcrypt(app)


@app.route("/")
def home():
    return render_template("index.html")


@app.route("/dashboard")
def dashboard():
    if not 'user_id' in session:
        return redirect("/")
    data = {'id': (session.get('user.id'))}
    user=User.get_one_by_id(data)
    return render_template("dashboard.html",user=user)


@app.route("/register", methods=["post"])
def register():
    print("🚀 "  *10, request.form, " 🚀   "*10)
    # if User.validate(requ)
    data = {**request.form}
    # data = {
    #     'first_name': request.form['first_name']
    # }
    if User.validate(data):
        # User data is valid
        # hash password
        pw_hash = bcrypt.generate_password_hash(data["password"])
        data["password"] = pw_hash
        # save
        method_return= User.create(data)
        print(method_return)
        session['user_id']=method_return
        return redirect (f"/dashboard")
    return redirect("/")


@app.route("/login", methods=["post"])
def login():
    user_in_db = User.get_one_by_email({"email": request.form["email"]})
    if not user_in_db:
        flash("Email does't exist.")
        return redirect("/")
    if not bcrypt.check_password_hash(user_in_db.password, request.form["password"]):
        # if we get False after checking the password
        flash("Invalid Password")
        return redirect("/")
    session['user_id'] = user_in_db.id
    return redirect("/dashboard")

# @app.route("/logout")
