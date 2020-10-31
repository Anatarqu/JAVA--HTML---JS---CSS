var texto = document.getElementById ("texto_lineas");
var boton = document.getElementById ("botoncito");
boton.addEventlistener ()"click", dibujoporClick );

function dibujoporClick ()
{
	var xxx = parsInt (texto.value);
	var d = document.getElementById ("dibujito");

    var l = 0;
    var y1, xf;


lienzo.beginPath ();
lienzo.StrokeStyle = "red";
lienzo.moveTo (100,100);
lienzo.lineTo (200,200);
lienzo.stroke ();
lieno.closePath ();

dibujarlinea ("pink", 10,300,270,10);
dibujarlinea ("yellow", 250, 200,10,30);

}

var lienzo = d.getContext ("2d");
var lineas = xxx;
var ancho = d.width;
 
function dibujarlinea (color, xinicial, yinicial, xfinal, yfinal)
{
lienzo.beginPath ();
lienzo.StrokeStyle = color;
lienzo.moveTo (xinicial,yinicial);
lienzo.lineTo (xfinal,yfinal);
lienzo.stroke ();
lieno.closePath ();
}