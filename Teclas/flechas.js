var teclas = {
    LEFT: 37,
    RIGHT: 39,
    UP: 38,
    DOWN: 40    
}

//console.log (teclas)

document.addEventListener("keydown", dibujarTeclado)
document.addEventListener("mousedown",empezarDibujo)
document.addEventListener("mouseup",finalizarDibujo)
var cuadrito = document.getElementById("area_de_dibujo")
var papel = cuadrito.getContext("2d") 
var x = 100
var y = 100
var colorMouse = "blue"

dibujarLinea("red", x-1, y-1, x+1, y+1, papel)

function dibujarTeclado(evento){
    var colorcito = "green"
    var movimiento = 1
    switch (evento.keyCode){
        case teclas.UP:
            dibujarLinea(colorcito, x, y, x, y-movimiento, papel)
            y=y-movimiento
            break
        case teclas.DOWN:
            dibujarLinea(colorcito, x, y, x, y+movimiento, papel)
            y = y+movimiento
            break
        case teclas.LEFT:
            dibujarLinea(colorcito, x, y, x-movimiento, y, papel)
            x = x-movimiento
            break
        case teclas.RIGHT:       
            dibujarLinea(colorcito, x, y, x+movimiento, y, papel)
            x = x+movimiento
            break
        default:
            console.log("otra tecla")
            break

    }
}

function empezarDibujo(evento){
    if (evento.target.id == "area_de_dibujo"){
        document.addEventListener("mousemove", dibujarSobre)
    }  
}

function finalizarDibujo(evento){
    document.removeEventListener("mousemove",dibujarSobre)
}

function dibujarSobre(evento){
    if (evento.target.id == "area_de_dibujo"){
        console.log(evento)
        
        x = evento.clientX - 10
        y = evento.clientY - 10
        dibujarLinea(colorMouse, x-1, y-1, x+1, y+1, papel)
    }
}

function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal, lienzo){
    lienzo.beginPath()
    lienzo.strokeStyle =  color
    lienzo.lineWidth = 3
    lienzo.moveTo(xinicial, yinicial)
    lienzo.lineTo(xfinal, yfinal)
    lienzo.stroke()
    lienzo.closePath()
}