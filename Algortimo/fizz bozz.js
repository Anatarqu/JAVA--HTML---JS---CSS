var  numeros = 100;
var divisible = false;

for (var i =1; i<=100; i++){
	
	if (i % 3 == 0 ) {
		document.write ("FIZZ");
		divisible = true;
	}
	
	if (i % 5 == 0) {
		document.write ("BOZZ");
		divisible = true;
	}
	
	if (i % 3 && i % 5 ==0) {
		document.write ("FIZZ BOZZ");
		
	}
	
	else {
			document.write(i);
	}
    document.write ("<br />");
}