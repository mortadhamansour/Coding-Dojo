from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE



class User:
    def __init__(self, data_dict):
        self.id = data_dict['id']
        self.first_name = data_dict['first_name']
        self.last_name = data_dict['last_name']
        self.email = data_dict['email']
        self.created_at = data_dict['created_at']
        self.updated_at = data_dict['updated_at']

    @classmethod
    def create(cls, data):
        query = """ INSERT INTO users (first_name, last_name, email)
                                VALUES (%(first_name)s, %(last_name)s, %(email)s)"""
        
        db_result = connectToMySQL(DATABASE).query_db(query, data)
        return db_result