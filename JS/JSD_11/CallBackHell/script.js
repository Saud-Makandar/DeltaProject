let h2 = document.querySelector("h2");
// function change(color){
//     h2.style.color=color;
// }
// setTimeout(change("red"),1000);
// setTimeout(change("blue"),2000);
// setTimeout(change("pink"),3000);
function change(color,delay,nextcolor){
    setTimeout(() => {
    h2.style.color=color;
    if(nextcolor)nextcolor();
},delay);
}
change("salmon",1000,()=>{
    change("orange",1000,()=>{
        change("purple",1000);
    });
});
