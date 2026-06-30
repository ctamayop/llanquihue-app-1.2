package cl.llanquihuetour.ui;


import cl.llanquihuetour.data.GestorServicios;
import cl.llanquihuetour.model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        ServicioTuristico[] servicio = gestor.crearServicios();

        System.out.println( "...:::Servicios Turísticos:::...\n");

        for (ServicioTuristico servicios : servicio){
            System.out.println(servicios);
            System.out.println("_________________________________________________________________________________________________");
        }
    }
}
