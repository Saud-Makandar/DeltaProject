const express = require("express");
const app = express();
const port = 3000;
const path=require("path");
const {v4:uuidv4}=require('uuid');
uuidv4();
app.listen(port,()=>{
    console.log(`Listening on port no ${port}`);
});
app.use(express.urlencoded({extended:true}));
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"));
app.set(express.static(path.join(__dirname,"public")));
let posts=[
    {   id:uuidv4(),
        username:"apnacollege",
        content:"I Love Coding"
    },
    {   id:uuidv4(),
        username:"Shradha Khapra",
        content:"I am a professor at Apna College"
    },
    {   id:uuidv4(),
        username:"Saud Makandar",
        content:"I am a student at Apna College"
    }
];
app.get("/",(req,res)=>{
    res.send("Server JindaBaad");
});
app.get("/posts",(req,res)=>{
    res.render("index");
});
