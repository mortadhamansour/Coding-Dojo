from flask_app import app
from flask import request ,render_template, session, redirect, flash
from flask_app.models.dojo import Dojo

@app.route('/')
def dojo():
    return render_template("dojo.html")