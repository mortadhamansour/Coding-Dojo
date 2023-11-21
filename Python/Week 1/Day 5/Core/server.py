from flask import Flask, render_template, session
app = Flask(__name__)

@app.route('/destroy_session ')
def session():
    if 'count' in session:
        print('key exists!')
    else:
        print("key 'count' does NOT exist")

session.clear()
session.pop('count')




if __name__=="__main__":
    app.run(debug= True, host='localhost', port=5000)