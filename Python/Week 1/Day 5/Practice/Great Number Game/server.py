from flask import Flask, render_template, session, redirect, request

import random

app = Flask(__name__)
app.secret_key = 'your_secret_key_here'  # Set a secret key for session

# Root route - Generate random number and display form to guess it
@app.route('/', methods=['GET', 'POST'])
def index():
    if 'random_number' not in session:
        session['random_number'] = random.randint(1, 100)

    if request.method == 'POST':
        guessed_number = request.form.get('guess')
        if guessed_number is not None and guessed_number.isdigit():
            guessed_number = int(guessed_number)
            if guessed_number == session['random_number']:
                return "Congratulations! You guessed the correct number."
            elif guessed_number < session['random_number']:
                message = "Try a higher number."
            else:
                message = "Try a lower number."
            return render_template('index.html', message=message)

    return render_template('index.html', message=None)

if __name__ == '__main__':
    app.run(debug=True)
