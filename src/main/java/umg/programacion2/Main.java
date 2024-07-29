package umg.programacion2;

import umg.programacion2.Autos.Coche;
import umg.programacion2.Autos.Moto;
import umg.programacion2.Autos.Vehiculo;
import umg.programacionII.Drivers.Conductor;
import umg.programacionII.Drivers.ConductorDeCoche;
import umg.programacionII.Drivers.ConductorDeMoto;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Coche("Toyota","Rav4",2015);
        Vehiculo moto = new Moto("Honda","Navi",2020);
        carro.mostrarDetalles();
        moto.mostrarDetalles();

        System.out.println();

        Conductor conductorDeCoche = new ConductorDeCoche("Juan Perez", "ABC123");
        Conductor conductormoto = new ConductorDeMoto("Maria Lopez","XYZ789");
        conductorDeCoche.mostrarInformacion();
        conductormoto.mostrarInformacion();

    }
}