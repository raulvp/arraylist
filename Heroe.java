
package edd82021;


public class Heroe {
    protected String nombre;
    protected String poder;
    protected int posicion;

    public Heroe(String nombre, String poder, int posicion) {
        this.nombre = nombre;
        this.poder = poder;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
    
}
