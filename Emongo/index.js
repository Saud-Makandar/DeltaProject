const mongoose = require('mongoose');
main()
    .then(()=>{
        console.log("Connection Established Successfully !!");
    }).catch((err)=>{
            console.log(err)
    })
async function main(){
    mongoose.connect('mongodb://127.0.0.1:27017/test');
}

const userSchema=new mongoose.Schema({
    name:String,
    email:String,
    age:Number 
});

const User=mongoose.model("User",userSchema);
const Employee=mongoose.model("Employee",userSchema);

const emp1 = new Employee({name:"Saud",email:"example@123.com",age:21});
emp1.save();