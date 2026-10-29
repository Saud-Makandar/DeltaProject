// const stud1={
//     name:"Saud",
//     age:21,
//     marks:100
// };
// const stud2={
//     name:"Nemi",
//     age:20,
//     marks:90
// };
// const stud3={
//     name:"Sumit",
//     age:20,
//     marks:80
// };
// let arr=[1,2,3];
// arr.sayhello=()=>{console.log("Hello Bacchoon !")};
//MAking a factory function
// function personmaker(name,age){
//             const person={
//                 name:name,
//                 age:age,
//                 talk:function talk(){
//                     console.log(`My name this ${this.name}`);
//                 }
//             };
//             return person;
// }
//Constructor
// function Person(name,age){
//     this.name=name;
//     this.age=age;
//     Person.prototype.talk=function(){
//         console.log(`Hi I am ${this.name}`);
//     }
// }
// let p2 = new Person("KalliAddami",24);
// let p1 = new Person("KalluAddam",27);
//Class Keywword
class Person{//Performing inheritance
    constructor(name,age){
        console.log("Person class constructor");
        this.name=name;
        this.age=age;
    }
    talk(){
        console.log(`Hey there ! I am ${this.name}`);
    }
}
// let p1 = new Person("Saud",21);
// let p2 = new Person("Sumit",20);
// let p3 = new Person("Nemi",20);
class Student extends Person{
    constructor(name,age,marks){
        console.log("Student class constructor");
        super(name,age);//Parent class constructor has been called
        this.marks=marks;
    }
    talk(){
        console.log(`Hey there , I am ${this.name}`);
    }
}
let stud1 = new Student("Saud",20,100);
let stud2 = new Student("Nemi",19,90);
let stud3 = new Student("Sumit",21,80);
class Teacher extends Person{
    constructor(name,age,subject){
        super(name,age);
        this.subject=subject;
    }
    talk(){
        console.log(`Hey there , I am ${this.name}`);
    }
}