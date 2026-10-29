const mongoose = require('mongoose');

const gupshapSchema = new mongoose.Schema({
    from:{
        type:String,
        required:true
    },
    to:{
        type:String,
        required:true
    },
    msg:{
        type:String,
        maxLenght:50
    },
    createdAt:{
        type:Date,
        required:true
    }
});

const Gupshup=mongoose.model("Gupshup",gupshapSchema);
module.exports = Gupshup;