from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def index():
    return render_template("index.html", num1=8, num2=8)

@app.route('/<int:numA>')
def repeat(numA):
    return render_template("/index.html", num1=numA ,num2=8)

@app.route('/<int:numA>/<int:numB>')
def repeat2(numA, numB):
    return render_template("/index.html", num1=numA ,num2=numB)

@app.route('/<int:numA>/<int:numB>/<string:color1>')
def color(numA, numB, color1):
    return render_template("/index.html", num1=numA ,num2=numB, color1=color1, color2='black')

@app.route('/<int:numA>/<int:numB>/<string:color1>/<string:color2>')
def color2(numA, numB, color1, color2):
    return render_template("/index.html", num1=numA ,num2=numB, color1=color1, color2=color2)



if __name__=='__main__':
    app.run(debug=True)