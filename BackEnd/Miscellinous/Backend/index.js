const express = require("express");
const app = express();
const port = 3000;
app.use(express.urlencoded({extended:true}));
app.use(express.json());
app.listen(port,()=>{
    console.log("The server is live now !");
});
app.get("/register",(req,res)=>{
    let {user,password}=req.query;
    res.send(`standard GET response. Welcome ${user}`);
});
app.post("/register",(req,res)=>{
    console.log(req.body);
    res.send("Standard POST response");
});