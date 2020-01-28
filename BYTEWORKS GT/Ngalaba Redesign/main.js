var nav = document.querySelector("nav");
var allSlides = document.querySelectorAll(".slideshow");
var navLinks = document.querySelectorAll("nav a");
var menubtn = document.querySelector("#menu-btn");
var logo = document.querySelector("#logo-container img");

const slideDelay = 5000;
var currentSlideCounter = 0;

allSlides[currentSlideCounter].style.display = "block";

/*Interval of Slide Display*/
setInterval(nextSlide,slideDelay);

//Implementing the nextSlide() function
function nextSlide(){
	//Hide the currently displayed slide
	allSlides[currentSlideCounter].style.display = "none";
	currentSlideCounter = (currentSlideCounter + 1) % allSlides.length;
	
	allSlides[currentSlideCounter].style.display ="block";
}

window.addEventListener("scroll",function(){
	if(window.pageYOffset>4){
		onScrolledDown();
	} else{
		onScrolledUp();
	}
})

function onScrolledDown(){
	//triggers the nav.scrolled style in the css
	nav.classList.add("scrolled");
	//change the links color to white
	for(i=0;i<4;i++){
		navLinks[i].style.color = "white";
	}
	//reduces the size of the logo
	logo.style.width = "150px";
}
function onScrolledUp(){
	nav.classList.remove("scrolled");
	for(i=0;i<4;i++){
		navLinks[i].style.color = "#82BF4C";
	}
	logo.style.width = "200px";
	
}

//For the menu toggle
menubtn.addEventListener("click", function(){
	menubtn.classList.toggle("active");
	nav.classList.toggle("active");
})