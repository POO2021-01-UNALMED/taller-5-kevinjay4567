package zooAnimales;

public class Ave extends Animal{
    public static int halcones;
    public static int aguilas;
    String colorPlumas;
    Ave[] listado;

    public Ave (){
    }
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
    }

    public static Animal crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return null;
    }

    public static Animal crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return null;
    }

    public String getColorPlumas(){
        return colorPlumas;
    }

}
