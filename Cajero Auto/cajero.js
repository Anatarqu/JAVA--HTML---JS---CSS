class billete {
	constructor (v,c) {
		this.valor =v;
		this.cantidad =c;
	}
}

function entregarDinero () {
	var t = document.getElementById ("dinero");
	dinero = t.value;
for (var bi of caja) 
{
	if (dinero > 0)
	 { 
	 	div =  Math.floor (dinero / bi.valor);
	 	if (div > bi.cantidad) 
	 	{
	 		papeles = bi.cantidad;
	 	}
	 	else{
	 		papeles = div;
	 	}
	 entregado.push (new billete (bi.valor, papeles));
	 dinero = dinero - (bi.valor * papeles);
	}
	if (dinero > 0) {
		resultado. inherHTML ="no tengo dinero";

		var r = document.getElementsById('resultado');
	}
	else{
		for (var e of entregado){
			if (e.cantidad > 0 ) {
				resultado.innerHTML = resultado.innerHTML + e.cantidad, + " billeres de $" + e.valor + <br/>;
			}
		
		}
	}
}

console.log (entregado);
}

var caja = [];
var entregado = [];
caja.push ( new  billete ( 50,3));
caja.push ( new  billete ( 20,2));
caja.push ( new  billete ( 10,2));

var dinero = 210;
var div = 0;
var papeles = 0;

var r = resultado
var b = document.getElementById ("extraer");
b.addEventListener ("click", entregarDinero);

