var imagenes = [];
imagenes ["Cauchin"] = "vaca.png";
imagenes ["Pokacho"] = "pollo.png";
imagenes ["Tocinauro"] = "cerdo.png";

var colección = [];
colección.push ( new Pakiman ("Cauchin", 100, 30));
colección.push ( new Pakiman ("Pokacho", 80, 50));
colección.push ( new Pakiman ("Tocinauro",120,40));

var pakin;
for ( pakin of colección){
	pakin.mostrar ();
}

