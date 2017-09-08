
package lab7;

import java.io.*;
import java.util.*;


public class AdminPersonas {
    private ArrayList<Persona> listaPersonas=new ArrayList();
    private File archivo;
    
    public AdminPersonas(String path) {
        archivo=new File(path);
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersonas;
    }

    public void setListaPersona(ArrayList<Persona> ListaPersona) {
        this.listaPersonas = ListaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPersona(Persona p){
        this.listaPersonas.add(p);
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Persona)objeto.readObject())!=null){
                        listaPersonas.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw= new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Persona t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
