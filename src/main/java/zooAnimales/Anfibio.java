package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    public static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(){

    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.venenoso = venenoso;
        this.colorPiel = colorPiel;

    }

    public static Animal crearRana(String nombre, int edad, String genero) {
        ranas++;
        return null;
    }

    public static Animal crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return null;
    }

    public String getColorPiel(){
        return colorPiel;
    }
    public boolean isVenenoso(){
        return venenoso;
    }

}
