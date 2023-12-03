from flask_app import app

# !all controllers must be imported here
from flask_app.controllers import ninjas
from flask_app.controllers import dojos

if __name__ == '__main__':
    app.run(debug=True, port = 5000)