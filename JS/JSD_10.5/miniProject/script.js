let gameseq=[];
let userseq=[];
let start=false;
let level=0;
let btn=["red","green","pink","purple"];
let h5 = document.querySelector("h5");
document.addEventListener("keypress",function(){
    if(start==false){
    start=true;
    levelup();
    }
    
});
function levelup(){
    level++;
    userseq=[];
    h5.innerText=`Level ${level}`;
    let randColor=btn[Math.floor(Math.random()*4)];
    let randbtn = document.querySelector(`.${randColor}`);
    gameseq.push(randColor);
    console.log(gameseq);
    btnflash(randbtn);   
}
function btnflash(btn){
    btn.classList.add("flash");
    setTimeout(function(){
        btn.classList.remove("flash");
    },500);
}
function uflash(btn){
    btn.classList.add("userflash");
    setTimeout(function(){
        btn.classList.remove("userflash");
    },500);
}
function btnpress(){
    console.log(this);
    let btn=this;
    uflash(btn);
    let usercolor=btn.getAttribute("id");
    console.log(usercolor);
    userseq.push(usercolor);
    check(userseq.length-1);
    
}
let allbtns=document.querySelectorAll(".box");
for(ele of allbtns){
    ele.addEventListener("click",btnpress);
}
function check(idx){
    if(userseq[idx]==gameseq[idx]){
        if(userseq.length==gameseq.length){
            setTimeout(levelup, 1000);
        }
    }
    else{
        h5.innerHTML=`Game over ! Your Score was <b>${level}<b> <br> Press any Key to start`;
        start=false;
        gameseq=[];
        userseq=[];
        level=0;
        document.querySelector("body").style.backgroundColor="red";
        setTimeout(() => {
            document.querySelector("body").style.backgroundColor="white";
        },750);
    }
}