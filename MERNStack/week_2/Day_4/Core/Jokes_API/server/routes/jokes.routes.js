const JokeController=require("../controllers/joke.controllers");



module.exports= app=>{
    app.get("/api/jokes", JokeController.findAllJoke);
    app.get("/api/jokes/:id", JokeController.findOneJoke);
    app.patch("/api/jokes/;id",JokeController.updateExisitingJoke);
    app.post("/api/jokes", JokeController.createNewJoke);
    app.delete ("api/jokes:id", JokeController.deleteOneJoke);



}