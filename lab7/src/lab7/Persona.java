





package lab7;


public class Persona extends Thread{
    private String nombre;
    private int ID;
    private int edad;
    private int altura;
    private String profecion;

    public Persona() {
    }

    public Persona(String nombre, int ID, int edad, int altura, String profecion) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.altura = altura;
        this.profecion = profecion;
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
    
    public void run(){
        
    }
}
