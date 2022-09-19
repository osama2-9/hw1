let bars = document.querySelector(".nav i");
let nav = document.querySelector(".side-nav");
let Nhide = document.querySelector(".side-nav i");


bars.onclick = function (){
    nav.classList.add("open");

}

Nhide.onclick = function (){
    nav.classList.remove("open")
}


