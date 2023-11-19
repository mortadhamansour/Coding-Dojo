class Ninja:
    def __init__(self, first_name, last_name, pet, treats, pet_food ):
        self.first_name = first_name
        self.last_name = last_name
        self.pet = pet
        self.treats = treats
        self.pet_food = pet_food
    def walk(self):
        self.pet.play()
        return self
    def feed(self):
        self.pet.eat()
        return self
    def bathe(self):
        self.pet.noise()
        return self
class Pet:
    def __init__(self, name, type, tricks):
        self.name = name
        self.type = type
        self.tricks = tricks
        self.energy = 100
        self.health = 100
    def sleep(self):
        self.energy += 25
    def eat(self):
        self.energy += 5
        self.health += 10
    def play(self):
        self.health += 5
    def noise(self):
        if self.type == "dog":
            print("hab hab")
        elif self.type == "cat":
            print("mew mew")
        else:
            print("moooo")
