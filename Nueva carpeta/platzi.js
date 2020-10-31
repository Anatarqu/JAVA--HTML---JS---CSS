var vp = document.getElementById("villaplatzi");
var papel = vp.getContext ("2d");
var mapa = "title.png";

var fondo ={
      url: "title.png",
      cargadoOK: false
};

var vaca = {
	url: "vaca.png",
	cargaOK: false
};

var cerdo ={
	url: "cerdo.png",
	cargaOK: false
};

var pollo = {
	url: "pollo.png",
	cargaOJ: false
};

fondo.imagen = new Image ();
fondo.imagen.src = fondo.url;
fondo.imagen.addEventListener ("load", cargarfondo);

vaca.imagen = new Image ();
vaca.imagen.src = vaca.url;
vaca.imagen.addEventListener ("load", cargarvacas);

cerdo.imagen = new Image ();
cerdo.imagen.src = cerdo.url;
cerdo.imagen.addEventListener ("load", cargarcerdos);

pollo.imagen = new Image ();
pollo.imagen.src = pollo.url;
pollo.imagen.addEventListener ("load", cargarpollos);

function cargarfondo ()
{
	fondo.cargaOK = true;
	dibujar();
}

function cargarvacas ()
{
	vaca.cargaOK = true;
	dibujar();
}

function cargarcerdos ()
{
	cerdo.cargaOK = true;
	dibujar();
}

function cargarpollos ()
{
	pollo.cargaOK = true;
	dibujar();
}


function dibujar ()
{
	if (fondo.cargaOK == true) 
	{
		papel.drawImage (fondo.imagen, 0, 0);
	}
	if (vaca.cargaOK ==true)
	{
		var cantidad = aleatorio (0,3);
		console.log (cantidad);
		for (var v=0, v<cantidad; v++)
		var x = aleatorio (0,420);
		var y = aleatorio (0,420);
		papel.drawImage (vaca.imagen,x, y);
	}
	if (cerdo.cargaOK ==true)
	{
		var cantidad = aleatorio (0,5);
		console.log (cantidad);
		for (var v=0, v<cantidad; v++)
		var x = aleatorio (0,420);
		var y = aleatorio (0,420);
		papel.drawImage (cerdo.imagen,x, y);
  	}
  	if (pollo.cargaOK ==true)
	{
		var cantidad = aleatorio (0,10);
		console.log (cantidad);
		for (var v=0, v<cantidad; v++)
		var x = aleatorio (0,420);
		var y = aleatorio (0,420);
		papel.drawImage (pollo.imagen,x, y);
	}
}
