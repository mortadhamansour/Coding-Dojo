const mongoose=require("mongoose")

const JokesSchema=new mongoose.Schema({

    setup:{
        type:String,
        required:[true ,"[path] is required"],
        minLength:[10 , "[path] must be at least 10 characters"]
    },
    punchline:{
        type:String,

    },
},{ timestamps: true }
);

const Joke =mongoose.model("Joke",JokesSchema);
module.exports = Joke;