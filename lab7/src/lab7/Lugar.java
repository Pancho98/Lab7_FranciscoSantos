package lab7;

public class Lugar extends Thread {

    private String nombre;
    private String clima;
    private int habitantes;
    private String zona;
    private int año;

    public Lugar() {
    }

    public Lugar(String nombre, String clima, int habitantes, String zona, int año) {
        this.nombre = nombre;
        this.clima = clima;
        this.habitantes = habitantes;
        this.zona = zona;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
}
