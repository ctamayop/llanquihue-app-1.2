package cl.llanquihuetour.app;

import cl.llanquihuetour.service.GestorDatos;
import cl.llanquihuetour.model.Tour;


public class Main {
    public static void main(String[] args) {



        GestorDatos gestor = new GestorDatos();

        // Cargar el archivo .txt
        gestor.cargarDatos("src/main/resources/tours.txt");

        // Mostrar todos los tours
        System.out.println("===== LISTA DE TOURS =====");

        for (Tour tour : gestor.getListaTours()) {
            System.out.println(tour);
            System.out.println("-------------------------");
        }

        // Filtrar tours con precio mayor a $30.000
        System.out.println("\n===== TOURS MAYORES A $30.000 =====\n");

        for (Tour tour : gestor.getListaTours()) {

            if (tour.getPrecio() > 30000) {
                System.out.println(tour);
                System.out.println("-------------------------");
            }
        }


    }
}
