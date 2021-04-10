package zooAnimales;

import gestion.Zona;

public class Animal {
    private String nombre;
    int edad;
    String habitat;
    String genero;
    Zona[] zona;
    int totalAnimales;

    public Animal(){

    }
    public Animal(String nombre, int edad, String habitat, String genero){

    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getHabitat(){
        return habitat;
    }
    public String getGenero(){
        return genero;
    }
}
