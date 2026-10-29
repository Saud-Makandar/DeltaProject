const express = require("express");
const app =express();

let port = 3000;
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});

app.use((req,res)=>{
 console.log("request recieved on server");
//  res.send("This is a basic  and acidic response");
 res.send({
  name:"apple",
  color:"red"
 });
});
 