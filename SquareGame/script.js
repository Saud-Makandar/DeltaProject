let box1=document.getElementById("box1");
box1.addEventListener("mouseenter",()=>{
    let m=Math.floor(Math.random()*100);
    box1.innerHTML=m;
});
box1.addEventListener("mouseleave",()=>{
    box1.innerHTML=1;
});
// let box1 = document.getElementById("box1");

// box1.addEventListener("mouseenter", () => {
//     setTimeout(() => {
//         let m = Math.floor(Math.random() * 100);
//         box1.innerHTML = m;
//     }, 5 * 1000);
// });

// box1.addEventListener("mouseleave", () => {
//     clearTimeout(timer); // cancel the pending timeout
//     box1.innerHTML = 1;
// });
let clr="green";
let box2=document.getElementById("box2");
box2.addEventListener("mouseenter",()=>{
    
    if(clr=="green"){
        box2.style.backgroundColor=clr;
        clr="red";
    }
    else{
        box2.style.backgroundColor=clr;
        clr="green";
    }

});
box2.addEventListener("mouseleave",()=>{
   box2.style.backgroundColor="white"
});
let box3=document.getElementById("box3");
box3.addEventListener("mouseenter",function(){
    let r=(Math.floor(Math.random()*256));
    let g=(Math.floor(Math.random()*256));
    let b=(Math.floor(Math.random()*256));
    box3.style.backgroundColor=`rgb(${r},${g},${b})`;
    });
box3.addEventListener("mouseleave",()=>{
box3.style.backgroundColor="white";
});
let box4=document.getElementById("box4");
box4.addEventListener("click",()=>{
    box1.style.backgroundColor="blue";
    box1.style.opacity=Math.random(); 
    box2.style.backgroundColor="pink";
    box2.style.opacity=Math.random();
    box3.style.backgroundColor="green";
    box3.style.opacity=Math.random();
});
box4.addEventListener("mouseleave",()=>{
box1.style.backgroundColor="white";
box2.style.backgroundColor="white";
box3.style.backgroundColor="white";
box1.style.opacity=1;
box2.style.opacity=1;
box3.style.opacity=1;
});