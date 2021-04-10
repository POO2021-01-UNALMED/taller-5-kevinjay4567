package zooAnimales;

public class Mamifero extends Animal{
    Mamifero[] listado;
    int caballos;
    int leones;
    boolean pelaje;
    int patas;

    public Mamifero(){
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){

    }
    public boolean isPelaje(){
        return pelaje;
    }
    public int getPatas(){
        return patas;
    }

}
