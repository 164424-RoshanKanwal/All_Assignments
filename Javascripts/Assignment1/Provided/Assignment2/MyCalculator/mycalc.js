function getMenuPrompt(){
	//do{
	var userSel = window.prompt("1. Add   2. Subtract  3. Multiply  4. Divide  5. Exponent  6. Mean  7. Quit","Give your option here");
	
if(userSel == 1){
	var num1 = Number(window.prompt("Enter First Number", "Number 1"));
	var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
	
	document.calc.result.value = ("Addition is " + (num1 + num2));
	//
	

}


else if(userSel == 2){
	var num1 = Number(window.prompt("Enter First Number", "Number 1"));
	var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
	
	document.calc.result.value = ("Subtraction is " + (num1 - num2));
}

else if(userSel == 3){
	var num1 = Number(window.prompt("Enter First Number", "Number 1"));
	var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
	
	document.calc.result.value = ("Multiplication is " + (num1 * num2));
}

else if(userSel == 4){
	var num1 = Number(window.prompt("Enter First Number", "Number 1"));
	var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
	
	document.calc.result.value = ("Quotient is " + (num1 / num2));
}

else if(userSel == 5){
	var num1 = Number(window.prompt("Enter First Number", "Number 1"));
	var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
	document.calc.result.value = ("Exponent is " + Math.pow(num1, num2));
}

else if(userSel == 6){
	var series = window.prompt("Enter Number Series to get MEAN and *** to end the series.", "Number Series must end with ***");
	var arraySeries = series.split(" ");
	var arrayLen = arraySeries.length;
	var i, total = 0;
	
	if (arraySeries[arrayLen-1] == "***") {
	
		for (i=0; i<arrayLen; i++){
			if(arraySeries[i] == "***"){
			break;
			}
			else {
			total += Number(arraySeries[i]);
			}
		}
	document.calc.result.value = ("Mean is " + (total/arrayLen));
	}
	
	else{
	document.getElementById('d').innerHTML= "Looks like you forget to put *** at the end of the series!!!";
	}

}
else if (userSel == 7){
	document.write('HAVE A NICE DAY AHEAD!!!');
}
else{
	document.getElementById('d').innerHTML = "Please Opt from the given options. :)";
}
//}
//while(userSel != 7);
//while(userSel != 7);

}



function timePass(){
}
/*function getNumbers(){
var num1 = Number(window.prompt("Enter First Number", "Number 1"));
var num2 = Number(window.prompt("Enter Second Number", "Number 2"));
}
getMenuPrompt();*/