// let x=document.querySelector("h2");
// x.style.color="red";
// x.style.fontFamily="Gill Sans";
// let y= document.querySelector("h1");
// y.style.backgroundColor="violet";
// setTimeout(()=>y.innerHTML="You are the best",5*1000);
let x=document.getElementById("ele1");
x.addEventListener("click",()=>{
    x.style.color="yellow";
    x.style.backgroundColor="brown";
})
let y=document.getElementById("ele2");
y.addEventListener("mousemove",()=>{
    y.style.color="white";
    y.style.backgroundColor="orange";
})
let z=document.getElementById("ele3");
// z.addEventListener("mouseenter",()=>{
//     z.style.color="violet";
//     z.style.backgroundColor="beige";
// })
//Mewto ko click karke pikachu ko change kardo
z.addEventListener("click",()=>{
    x.innerHTML="Balbasaur";
    x.style.color="#90EE90"
    x.style.backgroundColor="#006400";
})