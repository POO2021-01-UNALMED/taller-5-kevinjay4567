package zooAnimales;

public class Pez extends Animal{
    Pez[] listado;
    public static int salmones;
    public static int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    public Pez(){

    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){

    }

    public static Animal crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return null;
    }

    public static Animal crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return null;
    }

    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getCantidadAletas(){
        return cantidadAletas;
    }
}
