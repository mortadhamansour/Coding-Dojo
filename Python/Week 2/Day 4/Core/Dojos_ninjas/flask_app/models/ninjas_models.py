from flask_app.config.mysqlconnection import connectToMySQL
from flask_app.models import dojos_models




DATABASE = "dojos_ninjas_schema"


class Ninja:
    def __init__(self, data):
        self.id = data["id"]
        self.first_name = data["first_name"]
        self.last_name = data["last_name"]
        self.dojos_id=data["dojos_id"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]
        
        
        
    @classmethod
    def get_all(cls):
        query="SELECT * FROM ninjas;"  
        ninjas = []
        results = connectToMySQL (DATABASE).query_db(query)  
        for row in results:
            ninjas.append(cls(row))
        return ninjas
    @classmethod
    def save(cls,data):
        query = "INSERT INTO ninjas (first_name,last_name,age,dojos_id) VALUES (%(first_name)s,%(last_name)s,%(age)s,%(dojos_id)s);"
        return connectToMySQL (DATABASE).query_db(query,data) 
    
    @classmethod
    def get_by_id(cls,data):
        query = "SELECT * FROM ninjas WHERE ninjas.id=(%(id)s);"
        result=connectToMySQL (DATABASE).query_db(query,data)  
        return cls(result[0])
        
    