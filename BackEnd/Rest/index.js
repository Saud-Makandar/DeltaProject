const express = require("express");
const app=express();
const port = 3000;
const path=require("path")
const {v4:uuidv4}=require('uuid');
uuidv4();
app.use(express.urlencoded({extended:true}));
app.use(express.static(path.join(__dirname,"public")));
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"));

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
app.get("/posts",(req,res)=>{
    // res.send("The Server is working Well");
    res.render("index",{posts});
})//Getting as a main page
app.get("/",(req,res)=>{
    res.send("The Server is working Well");
})
app.get("/posts/new",(req,res)=>{
    res.render("new");// adding a new post
})
app.post("/posts",(req,res)=>{
    // console.log(req.boy);
    let {username,content}=req.body;
    let id=uuidv4();
    posts.push({id,username,content});
    res.redirect("/posts");//retriveing content from form and putting it in the array and showing it on the main
})
app.get("/posts/:id",(req,res)=>{
    let {id}=req.params;
    let post = posts.find((p)=> id===p.id);
    res.render("show",{post});// getting a specific post detals 
    // res.send("working");
})
app.patch("/posts/:id",(req,res)=>{
    let {id}=req.params;
    let post = posts.find((p)=> id===p.id);
    res.send("Patch req send");
})
app.listen(port,()=>{
    console.log("The Server is Live now ! ");
    
})