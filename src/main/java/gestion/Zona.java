package gestion;

import zooAnimales.Animal;

public class Zona {
    String nombre;
    Zoologico zoo;
    Animal[] animales;

    public Zona (String nombre, Zoologico zoo){

    }
    public Zona (){

    }
    public String getNombre(){
        return nombre;
    }
    public Zoologico getZoo(){
        return zoo;
    }
    public void agregarAnimales(Animal animal){

    }
    public int cantidadAnimales(){
        return animales.length;
    }
}
