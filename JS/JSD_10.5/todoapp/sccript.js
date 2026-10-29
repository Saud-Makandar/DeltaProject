// let add=document.querySelector("button");
// add.addEventListener("click",(event)=>{
//     let input = document.querySelector("input");
//     input.addEventListener("input",(event)=>{
//         let body = document.querySelector("body");
//         body.append(input.value);
//     })
// })
let btn=document.querySelector("button");
let ul=document.querySelector("ul");
let inp=document.querySelector("input");
let body=document.querySelector("body");
btn.addEventListener("click",function(){
    // console.log("Clicked",inp.value); 
    let item=document.createElement("li");
    item.innerText=inp.value;
    ul.appendChild(item);
    inp.value="";
    let btn=document.createElement("button");
    btn.innerText="delete";
    btn.classList.add("delete");// hum isse list item ke child me append kareinge
    item.appendChild(btn);
});
ul.addEventListener("click",function(event){
    if(event.target.nodeName="Button"){
        let par=event.target.parentElement;
        par.remove();
    }
})
// let delbtns = document.querySelectorAll(".delete");
// for(del of delbtns){
//     del.addEventListener("click",function(){
//         let par = this.parentElement;
//         par.remove();
//     })
// }