class User:		
    def __init__(self, first_name, last_name, email, age):
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0

    def display_info(self):
        print(f"Hello, my name is {self.first_name} {self.last_name} {self.email} {self.age}")
        return self
    def enroll(self):
        if self.is_rewards_member == True:
            print("User already a member.")
            return self
            
        else: 
            self.is_rewards_member = True
            self.gold_card_points = 200
            print(f"is rewards member : {self.is_rewards_member} gold card points : {self.gold_card_points}")
            return self
        


        
    def spend_points(self, amount):
        if self.gold_card_points > amount:
            self.gold_card_points -= amount
            print(self.gold_card_points)
        else:
            print("come back tomorrow")
        return self


user1 = User("Mortadha","Mansour","mortamansour123@gmail.com",20)
user1.display_info().enroll().spend_points(50).display_info()
user2 = User("efqgrshd","fdbsfg","ezfrettyjzry@gmail.com",50)
user2.enroll().spend_points(80).display_info()