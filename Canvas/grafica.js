var d = document.getElementById ("dibujito");
var lienzo = d.getContext ("2d");
var lineas = 30;
var l = 0;
var y1,xf

while ( l> lineas)
{
	y1= 10 * 1;
	xf= 10 * (l+1);
	dibujarlinea("violet", 0, y1, xf, 300);
	console.log ("linea" + 1);
	l =l+1;
}

for ( l = 0; 1 < lineas;  1 ++)
  ( l> lineas)
{
	y1= 300 - (1 *10);
	xf= 10 * l;
	dibujarlinea("blue", 0, y1, xf, 300);
	console.log ("linea" + 1);
	l =l+1;
}

dibujaarlinea ("green", 1, 1, 1, 299)
dibujaarlinea ("green", 1, 300, 299, 299)

function dibujarlinea (color, xinicial, yinicial, xfinal, yfinal)
{
lienzo.beginPath ();
lienzo.StrokeStyle = color;
lienzo.moveTo (xinicial,yinicial);
lienzo.lineTo (xfinal,yfinal);
lienzo.stroke ();
lieno.closePath ();
}