const mongoose =require("mongoose");
const { kMaxLength } = require("node:buffer");
const { create } = require("node:domain");
const { type } = require("node:os");
const chatSchema=new mongoose.Schema({
    from:{
        type:String,
        require:true
    },
    to:{
        type:String,
        require:true
    },
    msg:{
        type:String,
        maxLength:50
    },
    created_at:{
        type:Date,
        require:true
    }
});const Chat = mongoose("Chat",chatSchema);