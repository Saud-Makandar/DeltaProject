let inp = document.querySelector("input");
// inp.addEventListener("keydown",()=>{
//     console.log("Key was pressed");
// });
// inp.addEventListener("keyup",()=>{
//     console.log("Key was pressed");
// });
inp.addEventListener("keydown",function(event){
    console.log("code = ",event.code);
    if(event.code=="ArrowUp"){
        console.log("Character moves forward");
    }
    else if(event.code=="ArrowDown"){
        console.log("Character moves downward");
    }
    else if(event.code=="ArrowLeft"){
        console.log("Character moves left");
    }
    else if(event.code=="ArrowRight"){
        console.log("Character moves right");
    }
})// same u can replace arrowup key with wasd like in real life gaming