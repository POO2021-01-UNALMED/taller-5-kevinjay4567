package zooAnimales;

public class Pez extends Animal{
    Pez[] listado;
    int salmones;
    int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    public Pez(){

    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){

    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getCantidadAletas(){
        return cantidadAletas;
    }
}
