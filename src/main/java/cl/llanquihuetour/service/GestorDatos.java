package cl.llanquihuetour.service;

import cl.llanquihuetour.model.Tour;
import cl.llanquihuetour.model.Ubicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de gestionar la carga de datos de los tours
 * desde un archivo externo y almacenarlos
 */
public class GestorDatos {

    private ArrayList<Tour> listaTours;

    /**
     * Constructor de la clase GestorDatos
     */
    public GestorDatos() {
        listaTours = new ArrayList<>();
    }

    /**
     * Carga los datos de los tours desde un archivo de texto.
     *
     * @param ruta Ruta del archivo que contiene los datos.
     */
    public void cargarDatos(String ruta) {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                try {
                    String[] datos = linea.split(";");

                    // Valida que la línea tenga los 5 datos necesarios
                    if (datos.length == 5) {

                        String nombre = datos[0];
                        String tipo = datos[1];
                        int precio = Integer.parseInt(datos[2]);
                        String ciudad = datos[3];
                        String region = datos[4];

                        // Crea el objeto Ubicacion
                        Ubicacion ubicacion = new Ubicacion(ciudad, region);

                        // Crea el objeto Tour usando composición
                        Tour tour = new Tour(nombre, tipo, precio, ubicacion);

                        // Agrega el tour a la lista
                        listaTours.add(tour);

                    } else {
                        System.out.println("Línea con formato incorrecto: " + linea);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error en el precio del tour: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Retorna la lista de tours cargados desde el archivo
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
}