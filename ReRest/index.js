const express=require("express");
const app=express();
const port=3000;
const path=require("path");
const methodOverride=require("method-override");
const{ v4:uuidv4 }=require('uuid');
uuidv4();

app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"));

app.use(express.static(path.join(__dirname,"public")));

app.use(express.urlencoded({extended:true}));

app.use(methodOverride("_method"));


let posts=[
    {   
        id:uuidv4(),  
        username: "Saud Makandar",
        content : "I Love Sushi"
    },
    {  id:uuidv4(),
        username: "Sumit Bhendigeri",
        content : "I Love Laziness"
    },
    {  id:uuidv4(),
        username: "Saud Makandar",
        content : "I Love Mathematics"
    }
]

app.get("/posts",(req,res)=>{
    res.render("index.ejs",{posts});
})


app.get("/posts/new",(req,res)=>{
    res.render("post.ejs");
})

app.post("/posts",(req,res)=>{
    let{username,content}=req.body;
    let id=uuidv4();
   posts.push({
    id,
    username,
    content
});
    // console.log(req.body);
    res.redirect("/posts");
})

app.get("/posts/:id/edit", (req, res) => {
    let { id } = req.params;

    console.log("=================================");
    console.log("URL:", req.originalUrl);
    console.log("Requested ID:", id);

    console.log("All post IDs:");
    posts.forEach((p) => console.log(p.id));

    let post = posts.find((p) => p.id === id);

    console.log("Found:", post);

    if (!post) {
        return res.send("Post not found");
    }

    res.render("edit", { post });
    
});
app.get("/posts/:id",(req,res)=>{
    let {id} = req.params;
    let post=posts.find((p)=>p.id==id);
    res.render("show",{post});
})

app.patch("/posts/:id", (req, res) => {
    let { id } = req.params;
    let { content } = req.body;

    let post = posts.find((p) => p.id === id);

    if (!post) {
        return res.send("Post not found");
    }

    post.content = content;

    res.redirect("/posts");
});

app.delete("/posts/:id",(req,res)=>{
    let {id}=req.params;
    posts=posts.filter((p)=>p.id!=id);
    res.redirect("/posts");
});

app.listen(port,()=>{
    console.log("The Server is live now")
})          