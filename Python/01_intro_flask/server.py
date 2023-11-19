from flask import Flask,render_template
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/hello')
def hello():
    return "Hello From Server🚀🚀🚀"

@app.route('/hello/user')
def say_hello():
    return "<h1>Hello James 😁😁😁</h1>"

@app.route('/hello/user/<username>')
def say_hello_username(username):
    return f"<h1>Hello {username} 😁😁😁</h1>"

@app.route('/hello/user/<username>/<int:times>')
def say_hello_username_n_times(username, times):
    return f"<h1>Hello {username} 😁😁😁</h1>"*times

@app.route('/user/<username>/<int:age>')
def user_info(username, age):
    return f"<h1>USERNAME : {username} <br/> AGE : {age} </h1>"


@app.route('/index')
def index():
    return render_template("index.html", user = username, number = age)

@app.route('/index/<username>/<int:age>')
def index_2(username, age):
    users = [
        {'name':"Jhon", 'age':35},
        {'name':"Sarah", 'age':25},
        {'name':"Alex", 'age':28},
        {'name':"Amelia", 'age':23},
        {'name':"James", 'age':22},
        {'name':"Eric", 'age':56}]
    return render_template("index.html", username = username, number = age, users = users)
if __name__=="__main__":
    app.run(debug= True, port=1337)