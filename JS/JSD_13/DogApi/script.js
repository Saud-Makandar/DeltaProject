// let url="https://dog.ceo/api/breeds/image/random";
// let btn=document.querySelector("button");
// btn.addEventListener("click",async()=>{
//     let Op=await getimage();
//     let  img=document.getElementById("dog-image");
//     img.setAttribute("src",Op);
// });    
// async function getimage() {
//     try{
//         let res=await axios.get(url); 
//         return res.data.message;
//     }
//     catch(e){
//         return "error";
//     }
// }
let url="https://icanhazdadjoke.com/";
async function getJokes() {
    try{
        const config={ headers :{Accept:"application/json"}}
;        let res = await axios(url,config);
        console.log(res.data);
    }catch(e){
        console.log(e);
    }
    
}