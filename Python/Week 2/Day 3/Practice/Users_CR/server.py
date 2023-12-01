from flask import render_template
from flask_app import app

# !all controllers must be imported here








@app.route('/')
def home():
    return render_template("Read(All).html") 

@app.route('/create')
def create():
    return render_template("Create.html")

if __name__ == '__main__':
    app.run(debug=True, port = 5000)