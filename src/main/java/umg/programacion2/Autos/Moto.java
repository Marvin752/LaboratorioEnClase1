package umg.programacion2.Autos;

public class Moto extends Vehiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    public boolean tieneSidecar = true;
    @Override
    public void mostrarDetalles()
    {
        System.out.println("Marca: "+ marca +" Modelo: " + modelo + " Año: " + ano + " Sidecar: " + tieneSidecar);
    }
}
