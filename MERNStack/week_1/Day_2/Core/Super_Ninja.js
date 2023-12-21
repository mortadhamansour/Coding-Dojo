class Ninja{
    constructor(name){
        this.name = name
        this.health = 90
        this.speed = 3
        this.strength = 3
    }
    sayName=()=>{
        console.log(`${this.name}`);
    }
    showStats=()=>{
        console.log(`${this.name}, ${this.health}, ${this.speed}, ${this.strength}`);
    }
    drinkSake=()=>{
        this.health += 10;
        console.log(`${this.health}`);
    }
}
class Sensei extends Ninja{
    constructor(name){
        super(name, 200, 10, 10)
        this.wisdom = 10
    }
    speakWisdom=()=>{
        const message = super.drinkSake();
        console.log(message);
        console.log("What one programmer can do in one month, two programmers can do in two months.");
    }
    showStats=()=>{
        console.log(`${this.name}`);
    }
}
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();