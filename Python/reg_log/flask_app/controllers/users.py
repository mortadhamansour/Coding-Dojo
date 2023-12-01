from flask_app import app
from flask import render_tamplate, redirect, request, session
from flask_app.models.user import User

@app.route('/')
def home():
    return render_tamplate("index.html")
@app.route('/register', methods=["post"])
def register():
    print(request.form)
    data = {**request.form}
    if User.validate(data):
        User.create(data)
    return redirect("/")