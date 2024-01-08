const express =require("express");
const app=express();
require('dotenv').config();

require("./config/mongoose.config")



const port =process.env.port;
console.log(process.env.port);

app.use(express.json(), express.urlencoded({ extended: true }));


require ("./routes/jokes.routes")(app);

app.listen(port, () =>{
    console.log("listening to port" + port)
} )