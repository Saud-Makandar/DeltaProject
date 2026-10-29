let  btn=document.querySelector("button");
let p=document.querySelector("p");
let h1 =document.querySelector("h1");
let h3 =document.querySelector("h3");
function changeColor(color){
    console.dir(this.innerText);
    this.style.backgroundColor="blue";
}
btn.addEventListener("click",changeColor);
p.addEventListener("click",changeColor);
h1.addEventListener("click",changeColor);
h3.addEventListener("click",changeColor);
// is code me bothzayada redundancy hai that is the same code is repeated for different elements again and again
// therefor create one common function for all