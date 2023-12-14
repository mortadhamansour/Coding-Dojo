from flask_app import app
from flask import render_template,redirect,request
from flask_app.models import dojos_models, ninjas_models




@app.route('/dojos')
def dojos():
    all_dojos=dojos_models.Dojo.get_all()
    return render_template('dojos.html',all_dojos=all_dojos)

@app.route('/create/dojos',methods =['POST'])
def create_dojos():
    data={
        "name":request.form['name']
    }
    dojos_models.Dojo.save(data)
    return redirect('/dojos')

@app.route('/dojos/<int:id>')
def show_dojo(id):
    data={
        "id":id
    }
    return render_template('dojos.html',dojo=dojos_models.Dojo.get_by_id(data),ninja= ninjas_models.Ninja.get_by_id(data))


