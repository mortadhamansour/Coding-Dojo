from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash


class Dojo: 
    def __init__(self, data):
        self.id = data['id']
        self.name = data['name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    @classmethod
    def create_user(cls, data):
        query = """
        INSERT INTO users (name) 
        VALUES (%(name)s);
        """
        return connectToMySQL(DATABASE).query_db(query, data)