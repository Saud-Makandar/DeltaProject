const express = require("express");
const app = express();
const path = require("path");
const Chat = require("./models/chat");
const mongoose = require("mongoose");
app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");
main().then(()=>{
    console.log("connection successful ");
})
.catch(err => console.log(err));
async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/Whatsapp');
}
app.get("/chats",async(req,res)=>{
    let chats=await Chat.find();
    console.log('working');
    res.render("index",{chats})
})

app.listen(5000,()=>{
    console.log("The server is live now !!");
})