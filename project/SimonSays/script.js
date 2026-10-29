let gameseq=[];
let userseq=[];
let level=0;
let start=false;
let color=["salmon","green","cyan","yellow"];
document.addEventListener("keypress",function (){
    if(start==false){
        start=true;
        level++;
        flash();   
    }
});
function flash(){
let idx=Math.floor(Math.random()*4);
    let btn=document.querySelector(`.${color[idx]}`);
    btn.classList.add("flash");
    let p=document.querySelector("p");
    p.innerHTML=`<b>Level ${level}</b>`;
    gameseq.push(color[idx]);
    setTimeout(()=>{
        btn.classList.remove("flash");
    },500);
}
let btn=document.querySelectorAll(".box");
for(ele of btn){
    ele.addEventListener("click",userpress);
}

function userpress(){
     let parameter=this.getAttribute("id");
     console.log(parameter);
     userseq.push(parameter);
     check(userseq.length-1);
}
 function check(idx){
     if(userseq[idx]==gameseq[idx]){
        if(idx==gameseq.length-1){
            level++;
            userseq=[];
            setTimeout(flash, 1000);
        }
    }
    else{
            start=false;
            let p=document.querySelector("p");
            p.innerHTML=`Game over ! Your current Score was ${level}<br> Press any key to Restart`;
            level=0;
            gameseq=[];
            userseq=[];

        }
     }
 