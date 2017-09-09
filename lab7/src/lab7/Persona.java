









package lab7;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int ID;
    private int edad;
    private int altura;
    private String profecion;
    private String lugar;
    public static final long SerialVersionUID=333L;

    public Persona() {
    }

    public Persona(String nombre, int ID, int edad, int altura, String profecion, String lugar) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.altura = altura;
        this.profecion = profecion;
        this.lugar=lugar;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ID=" + ID + ", edad=" + edad + ", altura=" + altura + ", profecion=" + profecion + ", lugar=" + lugar + '}';
    }
    
    
}
