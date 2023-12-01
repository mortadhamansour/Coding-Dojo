from pet import Pet
class cat(Pet):
    def __init__(self, name, tricks):
        super().__init__(name, "cat", tricks)

gatito = cat("gatito", "sleep")
gatito.noise()