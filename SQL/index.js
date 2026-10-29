let express = require("express");
const app = express()
const path=require("path");
const methodOverride = require("method-override");
app.use(methodOverride("_method"));
app.use(express.urlencoded({extended:true}));//parsing of form data
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));

const { faker }=require('@faker-js/faker');
let getRandomUser=()=>{
     return [
     faker.string.uuid(),
     faker.internet.username(),
     faker.internet.email(),
     faker.internet.password()
     ];
}
// console.log(createRandomUser());

const mysql=require('mysql2');

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Saud_240517',
    database: 'node_app'
});

// let data=[];
// for(let i =0;i<=100;i++) data.push(getRandomUser())
// let query = "INSERT INTO user (id, username, email, password) VALUES ?";//chaaron values ko alag se pass kar sakte h

// let user=[["969","1996_newuser","abcsffsdf@gmail","abdsfsfsfdc"],
//             ["979","1976_newuser","abcs7fsdf@gmail","abds7sfsfdc"]
//             ];

// try{
//     connection.query(query,[data],(err,res)=>{
//     if(err)throw err;
//     console.log(res);
// });
// }catch(error){ 
//     console.log(error);
// }

// connection.end();

app.get("/",(req,res)=>{
    let q = `Select count(*) From user`;
    try{
        connection.query(q,(err,result)=>{
            if(err)throw err;
            let count=result[0]["count(*)"];
            res.render("index",{count});
            });
        }catch(error){ 
        console.log(error);
        res.send("Some error in db")
    }
});

app.get("/user",(req,res)=>{
    let q=`Select * From user`;
    try{
         connection.query(q,(err,result)=>{
            if(err)throw err;
            res.render("show",{result});// u can change the result to user for more semantic version
            });
        }catch(error){ 
        console.log(error);
        res.send("Some error in db")
    }
})
//edit route
app.get("/user/:id/edit",(req,res)=>{
    let {id}=req.params;
    let q=`Select * from user where id='${id}'`;// as a string pass karna h warne as a integer jayegi
    try{
         connection.query(q,(err,result)=>{
            if(err)throw err;
            let user=result[0];
            res.render("edit",{user});
            });
        }catch(error){ 
        console.log(error);
        res.send("Some error in db")
    }
   
})
app.patch("/user/:id",(req,res)=>{
    let {id}=req.params;
    let {password:formpass,username:nuser}=req.body;
    let q=`Select * from user where id='${id}'`;// as a string pass karna h warne as a integer jayegi
    try{
         connection.query(q,(err,result)=>{
            if(err)throw err;
            let user=result[0];
            if(formpass!=user.password) res.send("Wrong Password");
            else{
                //nested Query ka case
                let q2= `update user set username='${nuser}' Where id='${id}'`;
                connection.query(q2,(error,result)=>{
                    if(error) throw error;
                    res.redirect("/user");
                });
            }
            });
        }catch(error){ 
        console.log(error);
        res.send("Some error in db")
    }
})
app.listen("3000",(req,res)=>{
    console.log(`Server is lsitening on port no : 3000`);
})
