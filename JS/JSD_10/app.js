let btn = document.querySelector("button");
let h3=
btn.addEventListener("click",function(){
    let h3=document.querySelector("h3");
    let rcolor=randomColor();
    h3.innerText=rcolor;
    console.log("color updated");
    let div=document.querySelector('div');
    div.style.backgroundColor=rcolor;
})
//Ab hum random color ko generate karienge abhi toh humn ebus suna h
function randomColor(){
    let red= Math.floor(Math.random()*255);
    let green = Math.floor(Math.random()*255);
    let blue = Math.floor(Math.random()*255);
    let color=`rgb(${red},${green},${blue})`;
    return color;
}