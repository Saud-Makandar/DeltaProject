// let form=document.querySelector("form");
// form.addEventListener("submit",(event)=>{
    // event.preventDefault();
//     // alert("form is submitted");
//     let user=document.querySelector("#user");
//     let pass=document.querySelector("#pass");
//     console.log(user.value);
//     console.log(pass.value);
//     alert(`Hi ${user.value}, your password is set to ${pass.value}`);
// });
 let user=document.querySelector("#user");
 user.addEventListener("change",function(event){
    event.preventDefault();
    console.log("Input value changed");
    console.log("final value = ", this.value);
 })
  user.addEventListener("input",function(event){
    event.preventDefault();
    console.log("Input value changed");
    console.log("final value = ", this.value);
 })