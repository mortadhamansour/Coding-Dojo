from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello():
    return "Hello World!"

@app.route('/dojo')
def dojo():
    return "Dojo!"

@app.route('/say/<string:name>')
def name(name):
    return f"Hi {name}!"

@app.route('/repeat/<int:num>/<string:name>')
def repeat(num, name):
    return name * num


if __name__ == '__main__':
    app.run(debug=True, port=5000)