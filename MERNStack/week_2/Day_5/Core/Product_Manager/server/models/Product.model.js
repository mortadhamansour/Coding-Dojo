// import the mongoose lib
const mongoose = require("mongoose");

// the model
const ProductSchema= new mongoose.Schema({
    title:{
        type:String,
        required: [true, "{PATH} is required"],
        minLength: [3, "{PATH} must be at least 3 characters"],

    },
    price:{
        type:Number,
        required: [true, "please provide a date"],
    },
    description:{
        type:String,
        required: [true, "{PATH} is required"],
        minLength: [3, "{PATH} must be at least 3 characters"],

    }
},
{ timestamps: true }
);
const Product=mongoose.model("Product",ProductSchema);
module.exports=Product;