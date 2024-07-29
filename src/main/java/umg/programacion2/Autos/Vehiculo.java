package umg.programacion2.Autos;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int ano;
    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void mostrarDetalles(){
        System.out.println("Marca: "+ marca +" Modelo: " + modelo + " Año: " + ano);
    }
}
