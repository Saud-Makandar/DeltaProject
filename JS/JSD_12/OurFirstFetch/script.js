let url="https://catfact.ninja/fact";
fetch(url)
// .then((response)=>{
//     console.log(response);
//     response.json().then((data)=>{
//         console.log(data);
//     });
// })
// .catch((err)=>{
//     console.log("Error",err);
// });
.then((res)=>{
    console.log(res);
    return res.json();
})
.then((data)=>{
    console.log(data.fact);
}).catch((err)=>{
    console.log("Error",err);
 });