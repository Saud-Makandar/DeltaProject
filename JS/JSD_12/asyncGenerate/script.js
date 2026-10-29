
// function savetoDB(data){// it is just returning a promise 
//      return new Promise((success,failure)=>{
//         let internetspeed=Math.floor(Math.random()*10)+1;
//         if(internetspeed>4){
//             success("Data was saved");
//         }
//         else{
//             failure("Failure : weak connection ");
//         }
//      });
// }
// async function greet(){
//     // return "hello";
// }
// let demo=async()=>{
//     return 5;//here it is shown that u can make arrow function as async as well
// }

function getNum(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{let num = Math.floor(Math.random()*10)+1;
        console.log(num);
        resolve();
        },1000);
    });
}
async function demo(){
    await getNum();
    await getNum();
    await getNum();
    await getNum();
}