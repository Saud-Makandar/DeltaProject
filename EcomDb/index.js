const express =  require("express");
const app=express();
const path=require("path");
const port=8081;
app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");
const mongoose = require('mongoose');
const Gupshup=require("./models/chat.js");
main().then((res)=>{
        console.log("Apna Result");
}).catch((err)=>console.log(err)); 
async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/Gupshup');
}
// let gossip1=new Gupshup(
//     {
//         from:"Kim ji won",
//         to:"Saud Makandar",
//         msg:"I am ur biggest fan",
//         createdAt:new Date()
//     }
// );
// gossip1.save().then((res)=>{
//     console.log(res);
// })
app.get("/Chats",async (req,res)=>{
    let chat=await Gupshup.find()
    console.log(chat);
    res.render("index.ejs",{chat})
})
app.listen(port,()=>{
    console.log("Server is listening on port 8081");
});