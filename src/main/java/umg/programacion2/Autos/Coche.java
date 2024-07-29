package umg.programacion2.Autos;

public class Coche extends Vehiculo{
    public Coche(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    public int puertas = 4;

    @Override
public void mostrarDetalles(){
    System.out.println("Marca: "+ marca +" Modelo: " + modelo + " Año de lanzamiento: " + ano + " Numero de puertas: " + puertas);
}
}
