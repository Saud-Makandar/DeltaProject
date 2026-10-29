const mongoose = require('mongoose');


main().then(()=>{
    console.log("connection successfull");
})
.catch(err=>console.log(err));

async function main() {
     await mongoose.connect("mongodb://127.0.0.1:27017/test");
}

const userSchema = new mongoose.Schema({
    name:String,
    email:String,
    age:Number,
});

const User = mongoose.model("User",userSchema);

// const user1=new User({
//     name:"Saud Abdul Samad Makandar",
//     email:"example@gmail.com",
//     age:48,
// });// yeh auto matically insert nhi hota 
// user1.save()

// User.insertMany([
//     {name:"Sarah Mendonca",email:"sarahexample@gmail.com",age:96},
//     {name:"Nemi Doshi",email:"nemiexample@gmail.com",age:26},
//     {name:"Sumit Bhendigeri",email:"sumitxample@gmail.com",age:19},
// ]).then((res)=>{
//     console.log(res);
// })
// User.find({age:{$gt:40}}).then((res)=>{
//     console.log(res);
// })
// User.updateOne({name:"Nemi Doshi"},{name:"Chota Shree"}).then((res)=>{
//     console.log(res);
// })
// User.find({age:26}).then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// })
// User.findOneAndUpdate({age:96},{name:"Beauty"})
// .then((res)=>{
//     console.log(res);
// })
// User.find({age:96}).then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// })
// User.findByIdAndUpdate({_id:'6a7eeec6bdb3635f6509126b'},{name:"SleepingBeauty"})
// .then((res)=>{
//     console.log(res);
// })
// User.findById({_id:'6a7eeec6bdb3635f6509126b'}).then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// })
// User.deleteOne({age:19}).then((res)=>{
//     console.log(res);
// })
// User.find().then((res)=>{
//     console.log(res)
// })

//Proper way to define Scehmas
