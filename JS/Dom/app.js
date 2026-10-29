let image=document.getElementsByClassName("oldImg");
for(let i=0;i<image.length;i++){
    image[i].src="assets/spiderman_img.png"
    console.log(`value of image no ${i} is changed`);
}
let links = document.querySelectorAll('.box a');
for ( ele of links) {
    ele.style.color = "orange";
}