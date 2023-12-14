from ..config.mysqlconnection import connectToMySQL



DATABASE= "dojos_ninjas_schema"


class Dojo:
    def __init__(self, data):
        self.id = data["id"]
        self.name = data["name"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]
        
    @classmethod
    def get_all(cls):
        query="SELECT * FROM dojos;"  
        dojos= []
        results = connectToMySQL (DATABASE).query_db(query)  
        for row in results:
            dojos.append(cls(row))
        return dojos   
    
    @classmethod
    def save(cls,data):
        query = "INSERT INTO dojos (name) VALUES (%(name)s);"
        return connectToMySQL (DATABASE).query_db(query,data) 
    
    @classmethod
    def get_by_id(cls,data):
        query = "SELECT * FROM dojos WHERE id=(%(id)s);"
        result=connectToMySQL (DATABASE).query_db(query,data)  
        return cls(result[0])
    
    
        