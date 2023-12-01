from flask import Flask

app = Flask(__name__)
app.secret_key = "Stay safe"
DATABASE = "Users_curd_modularized_db"