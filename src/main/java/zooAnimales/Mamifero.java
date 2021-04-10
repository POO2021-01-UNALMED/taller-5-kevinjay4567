package zooAnimales;

public class Mamifero extends Animal{
    public static int caballos;
    public static int leones;
    Mamifero[] listado;
    boolean pelaje;
    int patas;

    public Mamifero(){
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){

    }

    public static Animal crearLeon(String nombre, int edad, String genero) {
        leones++;
        return null;
    }
    public static Animal crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return null;
    }

    public boolean isPelaje(){
        return pelaje;
    }
    public int getPatas(){
        return patas;
    }
}
