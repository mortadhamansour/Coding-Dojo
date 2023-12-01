from flask_app import app


# ! all controllers must be imported here
from flask_app.controllers import users

if __name__ == '__main__':
    app.run(debug=True, port=5001)

