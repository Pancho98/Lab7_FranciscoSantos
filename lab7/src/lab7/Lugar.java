package lab7;

import javax.swing.JFrame;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Lugar extends Thread {

    private String nombre;
    private String clima;
    private int habitantes;
    private String zona;
    private int año;
    private JFrame fr;
    private ArrayList<Persona> p =new ArrayList();

    public Lugar() {
    }

    public Lugar(String nombre, String clima, int habitantes, String zona, int año, JFrame fr) {
        this.nombre = nombre;
        this.clima = clima;
        this.habitantes = habitantes;
        this.zona = zona;
        this.año = año;
        this.fr = fr;
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

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public ArrayList<Persona> getP() {
        return p;
    }

    public void setP(ArrayList<Persona> p) {
        this.p = p;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    @Override
    public void run() {
        Lugares pl = new Lugares();
        fr = pl;
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
       pl.jl_titulo.setText(nombre);
        while(true){
            for (int i = 0; i <p.size() ; i++) {
                if (pl.jl_titulo.getText().equals(p.get(i).getLugar())) {
                    Persona pp = p.get(i);
                    Object ob[] = {pp.getNombre(),pp.getID(),pp.getEdad(),pp.getAltura(),pp.getProfecion(),pp.getLugar()};
                    DefaultTableModel tabla = (DefaultTableModel)pl.Table.getModel();
                    tabla.addRow(ob);
                    pl.Table.setModel(tabla);
                    p.remove(p.get(i));
                }
            }
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        }
    }

}
