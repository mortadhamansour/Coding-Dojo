from flask_app.config.mysqlconnection import connectToMysql

class user:
    def __init__ (self, data_dict):
        self.id = data_dict['id']
        self.first_name = data_dict['first_name']
        self.last_name = data_dict['last_name']
        self.email = data_dict['email']
        self.password = data_dict['password']
        self.created_at = data_dict['created_at']
        self.updated_at = data_dict['updated_at']

        @classmethod
        def create(cls, data):
            query = """
                    INSERT INTO users
                                (first_name, last_name, email, password)
                            VALUES
                                (%(first_name)s, %(last_name)s, %(email)s, %(password)s );"""
            db_result = connectToMysql(DATABASE).query_db(query, data)
            print("INSERT STATEMENT RETURN : ", db_result, )
            return db_result
        @staticmethod
        def validate(data):
            is_valid = True
            if len(data['first_name']) <2:
                is_valid = False
            if len(data['last_name']) <2:
                is_valid = False
            return is_valid
