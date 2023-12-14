from flask_app import app

#! ALWAYS REMEMBER TO DECLARE YOUR ROUTES
from flask_app.controllers import dojos_controllers
from flask_app.controllers import ninjas_controllers

if (
    __name__ == "__main__"
):  # Ensure this file is being run directly and not from a different module
    app.run(debug=True)  # Run the app in debug mode.