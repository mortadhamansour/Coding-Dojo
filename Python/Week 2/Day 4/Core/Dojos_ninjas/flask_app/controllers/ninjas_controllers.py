from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.ninjas_models import Ninja
from flask_app.models.dojos_models import Dojo

@app.route('/ninjas')
def movies():
    all_dojos=Dojo.get_all()
    all_ninjas=Ninja.get_all()
    return render_template('ninjas.html',all_dojos=all_dojos,all_ninjas=all_ninjas)

@app.route('/create/ninja',methods=['POST'])
def create_ninja():
    data={
        "first_name":request.form['first_name'],
        "last_name" :request.form['last_name'],
        "age":request.form['age'],
        "dojos_id":request.form['dojos_id']
    }
    Ninja.save(data)
    return redirect('/ninjas')

@app.route("/ninja/<int:ninja_id>")
def show_ninja(ninja_id):
    data = {"id": ninja_id}
    ninja = Ninja.get_by_id(data)
    data2 = {"id": ninja.dojos_id_id}
    dojo = Dojo.get_by_id(data2)
    return render_template("show.html", ninja=ninja, dojo=dojo)




