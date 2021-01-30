package programacionpc;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Ascii {
   
    public void dibujarTexto(String texto, String caracterArte, Configuracion configuracion) {
        BufferedImage imagen = getImageIntegerMode(configuracion.ancho, configuracion.alto);
        Graphics2D grafico2D = getGraphics2D(imagen.getGraphics(), configuracion);
        grafico2D.drawString(texto, 6, 24);

        for (int y = 0; y < configuracion.alto; y++) {
            StringBuilder cadenaGraficoFinal = new StringBuilder();
            for (int x = 0; x < configuracion.ancho; x++) {
                cadenaGraficoFinal.append(imagen.getRGB(x, y) == -16777216 ? " " : caracterArte);
            }

            if (cadenaGraficoFinal.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(cadenaGraficoFinal);
        }

    }

    
    private BufferedImage getImageIntegerMode(int ancho, int alto) {
        return new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
    }

    private Graphics2D getGraphics2D(Graphics graficos, Configuracion configuracion) {
        graficos.setFont(configuracion.fuente);
        Graphics2D graphics2D = (Graphics2D) graficos;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        return graphics2D;
    }

    public static class Configuracion {
        public Font fuente;
        public int ancho;
        public int alto;

        public Configuracion(Font fuente, int ancho, int alto) {
            this.fuente = fuente;
            this.ancho = ancho;
            this.alto = alto;
        }
    }

    public static void main(String[] args) {
        Ascii arte = new Ascii();
        Font fuente = new Font("Dialog", Font.PLAIN, 24);
        Configuracion configuracion = new Configuracion(fuente, 144, 32);
        arte.dibujarTexto("JAVA", "*", configuracion);
    }
}