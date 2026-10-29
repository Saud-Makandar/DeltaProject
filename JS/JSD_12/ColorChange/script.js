let h2 = document.querySelector("h2");
function change(color,delay){
    return new Promise((resolve,reject)=> {
         setTimeout(() => {
            let num = Math.floor(Math.random()*10)+1;
            if(num>3) reject("Promise got rejected");
            h2.style.color=color;
            console.log(`color changed to ${color}!`);
            resolve("Color changed");
            },delay);
});
}async function demo(){
    try{
        await change("orange",1000);
        await change("red",1000);
        await change("blue",1000);
        await change("green",1000);
    }
    catch(err){
        console.log(err);
    }
    
}
demo();