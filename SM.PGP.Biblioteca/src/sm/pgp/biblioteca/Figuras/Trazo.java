package sm.pgp.biblioteca.Figuras;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

/**
 * Clase Trazo que hereda de FiguraPro. 
 * Su funcionamiento es similar al de la clase GeneralPath.Float.
 * @author gervi
 */
public class Trazo extends FiguraPro{
    
    private Rectangle recContenedor;
    /**
     * Constructor de la clase.
     * @param ct: color de trazo.
     */
    public Trazo(Color ct){
        super();
        tipo = Tipo.TRAZO;
        colorTrazo = ct;
        miShape = new GeneralPath.Float();
    }
    /**
     * Agrega un punto a la ruta moviendo las coordenadas especificadas con precisión float.
     * @param x: componente x de la posicion.
     * @param y: componente y de la posicion.
     */
    public void moveOrigin(float x, float y){
        ((GeneralPath.Float)miShape).moveTo(x, y);
    }
    /**
     * Agrega un punto a la ruta dibujando una línea recta desde las coordenadas actuales a las nuevas coordenadas especificadas.
     * @param x: componente x de la posicion.
     * @param y: componente y de la posicion.
     */
    public void lineToPoint(float x, float y){
        ((GeneralPath.Float)miShape).lineTo(x, y);
        recContenedor = ((GeneralPath.Float)miShape).getBounds();
    }

    /**
     * Establece el color de relleno (no hace nada ya que las lineas no tienen relleno).
     * @param color: nuevo color.
     */
    @Override
    public void setColorRelleno(Color color) {
    }
    /**
     * Devuelve el color del relleno(no hace nada ya que las lineas no tienen relleno).
     * @return el color del trazo al no tener relleno.
     */
    @Override
    public Color getColorRelleno() {
        return this.getColorTrazo();
    }
    /**
     * Establece si este Trazo tiene relleno o no(no hace nada ya que las lineas no tienen relleno).
     * @param rll: si tiene relleno o no (Spoiler: no va a tener).
     */
    @Override
    public void setRelleno(boolean rll) {
    }
    /**
     * Devuelve que este Trazo no tiene relleno.
     * @return no tiene relleno.
     */
    @Override
    public boolean getRelleno() {
        return false;
    }
    /**
     * Devuelve un Rectangle que encierra a este Trazo.
     * @return un Rectangle que encierra a este Trazo.
     */
    @Override
    public Rectangle getBounds() {
        return ((GeneralPath.Float)miShape).getBounds();
    }
    /**
     * Devuelve el minimo en x de este Trazo con precision de double.
     * @return el minimo en x de este Trazo con precision de double.
     */
    @Override
    public double getMinX(){
        return recContenedor.getMinX();
    }
    /**
     * Devuelve el minimo en y de este Trazo con precision de double.
     * @return el minimo en y de este Trazo con precision de double.
     */
    @Override
    public double getMinY(){
        return recContenedor.getMinY();
    }
    /**
     * Devuelve el maximo en x de este Trazo con precision de double.
     * @return el maximo en x de este Trazo con precision de double.
     */
    @Override
    public double getMaxX(){
        return recContenedor.getMaxX();
    }
    /**
     * Devuelve el maximo en y de este Trazo con precision de double.
     * @return el maximo en y de este Trazo con precision de double.
     */
    @Override
    public double getMaxY(){
        return recContenedor.getMaxY();
    }
    /**
     * Establece la posicion de este Trazo.
     * @param x1: Coordenada x del primer punto.
     * @param y1: Coordenada y del primer punto.
     * @param x2: Coordenada x del segundo punto.
     * @param y2: Coordenada y del segundo punto.
     */
    @Override
    public void setPosicion(double x1, double y1, double x2, double y2) {
        //recContenedor.setFrameFromDiagonal(x1, y1, x2, y2);
        ((GeneralPath.Float)miShape).moveTo(x1, y1);
    }
    
}
