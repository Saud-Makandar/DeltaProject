let h2 = document.querySelector("h2");
function change(color,delay){
    return new Promise((resolve,reject)=> {
         setTimeout(() => {
            h2.style.color=color;
            resolve("Color changed");
            },delay);
});
}
// change("salmon",1000,()=>{
//     change("orange",1000,()=>{
//         change("purple",1000);
//     });
// });