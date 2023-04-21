
//excercise 1
var numbers = "12345";

document.write(numbers);
document.write("<br></br>");

for (i = numbers.length - 1; i >= 0; i--) {

  document.write(numbers[i]);
}

var number = 12345;
var reversed = 0;
while (number > 0) {

  var temp = number % 10;
  reversed = reversed * 10 + temp;
  number = Math.floor(number / 10);
}

document.write("<br></br>" + reversed);

//excercise 2
function Book() {

  this.digit = 4;
  this.dolo = 5;


  this.display = function () {
    document.write("<br>");
    document.write("<br>");
    document.write(this.digit + this.dolo);
  }
}

var b = new Book();
b.display();


//excercise 3

a = new Array(10, 2, 32, 14, 53, 6, 72, 8, 9);

var min = 10000000;
var max = -1;

for (i = 0; i < a.length; i++) {

  if (min > a[i]) {
    min = a[i];
  }
  if (max < a[i]) {
    max = a[i];
  }
}
document.write("<br></br>")
document.write("Max is " + max + ". Min is " + min);
document.write("<br></br>")

//excercise 4
var animals = new Array("dog", "cat");
animals.push("lemur", "chimp");
animals.pop();
animals.pop();
animals.unshift("lemur", "chimp");
animals.shift();
animals.sort();
animals.reverse();
var all_string = animals.join(",");
document.write("<br></br>" + all_string);
document.write("<br></br>")

function grass() {
  document.bgColor = "green";
}

function magenta() {
  document.bgColor = "magenta";
}
function sky() {
  document.bgColor = "lightblue";
}
function sun() {
  document.bgColor = "orange";
}
