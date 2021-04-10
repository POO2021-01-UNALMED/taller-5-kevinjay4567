package gestion;

import java.util.ArrayList;

public class Zoologico {
    String nombre;
    String ubicacion;
    ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion){
    }
    public Zoologico() {
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        int total = 0;
        for(Zona zona : zonas){
            total += zona.cantidadAnimales();
        }
        return total;
    }
    public Zona getZona(int i){
        return zonas.get(i);
    }
}
