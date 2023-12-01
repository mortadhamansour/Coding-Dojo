from flask import Flask, render_template, session, redirect

app = Flask(__name__)
app.secret_key = 'stay_safe'


@app.route('/')
def index():
    session['visit_count'] = session.get('visit_count', 0) + 1
    return render_template('index.html', visit_count=session['visit_count'])

@app.route('/destroy_session', methods=['POST'])
def destroy_session():
    session.clear()
    return redirect('/')

if __name__ == '__main__':
    app.run(debug=True)
