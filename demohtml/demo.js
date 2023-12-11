var slideindex = 1;
showslide(slideindex);

function plusone(n)
{
    showslide(slideindex += n);
}

function showslide(n){
    var i;
    x=document.getElementsByClassName("slides");
    if(n > x.length){
        slideindex=1
    }
    if(n < 1)
    {
        slideindex= x.length;
    }
    for(i = 0;i < x.length;i++){
        x[i].style.display = "none";
    }
    x[slideindex-1].style.display= "block";
}

function validateForm() {
    let x = document.forms["login"]["user"].value;
    if (x == "") {
      alert("provide valid email id");
      return false;
    }
    let y = document.forms["login"]["pass"].value;
    if (y.length <= 8) {
      alert("password must have atleast 8 characters");
      return false;
    }
  }