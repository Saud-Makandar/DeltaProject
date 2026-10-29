const mongoose = require('mongoose');
const Gupshup=require("./models/chat.js");
main().then((res)=>{
        console.log("Apna Result");
}).catch((err)=>console.log(err)); 
async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/Gupshup');
}
let gossip1=new Gupshup(
    {
        from:"Kim ji won",
        to:"Saud Makandar",
        msg:"I am ur biggest fan",
        createdAt:new Date()
    }
);
let juicyGossip=([
    {
         from:"Ha young",
        to:"Saud Makandar",
        msg:"I am impressed with u",
        createdAt:new Date()
    },
    {
         from:"Ba suzy",
        to:"Saud Makandar",
        msg:"will u go on a dinner with me",
        createdAt:new Date()
    },
    {
         from:"Gwen Tennison",
        to:"Saud Makandar",
        msg:"You are so handsome",
        createdAt:new Date()
    },{
         from:"Cynthia",
        to:"Saud Makandar",
        msg:"I Love u",
        createdAt:new Date()
    }
]);
Gupshup.insertMany(juicyGossip);