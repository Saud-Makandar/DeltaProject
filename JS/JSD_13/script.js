let btn=document.querySelector("button");
btn.addEventListener("click",async()=>{
    let Op=await getFacts();
    console.log(Op);
    let p=document.querySelector("p");
    p.innerText=Op;
})
async function getFacts() {
    try{
        let res=await axios.get("https://catfact.ninja/fact"); 
        return res.data.fact;
    }
    catch(e){
        return "error";
    }
}