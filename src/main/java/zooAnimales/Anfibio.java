package zooAnimales;

public class Anfibio extends Animal{
    Anfibio[] listado;
    int ranas;
    int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(){

    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){

    }
    public String getColorPiel(){
        return colorPiel;
    }
    public boolean isVenenoso(){
        return venenoso;
    }

}
