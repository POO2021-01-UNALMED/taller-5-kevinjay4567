package zooAnimales;

public class Reptil extends Animal{
    Reptil[] listado;
    public static int iguanas;
    public static int serpientes;
    String colorEscamas;
    int largoCola;

    public Reptil(){

    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){

    }

    public static Animal crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return null;
    }

    public static Animal crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return null;
    }

    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getLargoCola(){
        return largoCola;
    }
}
