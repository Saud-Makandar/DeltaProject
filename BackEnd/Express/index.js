const express = require("express");
const app=express();
console.dir(app);
let port= 3000;
app.listen(port, ()=>{
    console.log("app is listening for the request");
});

// app.use((req,response)=>{
//     console.log("Request recieved");
//     response.send({
//         name:"Master Saud",
//         type:"Student"
//     });
// });
app.get("/",(req,res)=>{
    res.send("you concated the root node");
});
app.get("/apple",(req,res)=>{
    res.send("you concated the root node");
});
app.get("/mango",(req,res)=>{
    res.send("you concated the root node");
});
app.get("/:username/:id",(req,res)=>{
    let {username,id} = req.params;
    res.send(`Welcome to the page of ${username}`);
});
app.get("/search",(req,res)=>{
    console.log(req.query);
    res.send("No Resultssss");
});