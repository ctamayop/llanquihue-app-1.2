package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ColaboradorExterno;
import cl.llanquihuetour.model.GuiaTuristico;
import cl.llanquihuetour.model.Registrable;
import cl.llanquihuetour.model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    // Almacena distintos tipos de entidades mediante la interfaz común.
    private final ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        if (entidad != null) {
            entidades.add(entidad);
        }
    }

    public int obtenerCantidadEntidades() {
        return entidades.size();
    }

    // Recorre la colección y diferencia cada entidad mediante instanceof.
    public String generarReporte() {
        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        StringBuilder reporte = new StringBuilder();
        int cantidadGuias = 0;
        int cantidadVehiculos = 0;
        int cantidadColaboradores = 0;

        reporte.append("ENTIDADES REGISTRADAS EN LLANQUIHUE TOUR\n");
        reporte.append("========================================\n\n");

        for (Registrable entidad : entidades) {
            if (entidad instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) entidad;
                reporte.append("TIPO: GUÍA TURÍSTICO\n");
                reporte.append(guia.mostrarResumen());
                reporte.append("Función: acompañar y orientar a los turistas.\n");
                cantidadGuias++;

            } else if (entidad instanceof Vehiculo) {
                Vehiculo vehiculo = (Vehiculo) entidad;
                reporte.append("TIPO: VEHÍCULO\n");
                reporte.append(vehiculo.mostrarResumen());
                reporte.append("Función: transportar pasajeros durante los tours.\n");
                cantidadVehiculos++;

            } else if (entidad instanceof ColaboradorExterno) {
                ColaboradorExterno colaborador = (ColaboradorExterno) entidad;
                reporte.append("TIPO: COLABORADOR EXTERNO\n");
                reporte.append(colaborador.mostrarResumen());
                reporte.append("Función: prestar servicios externos a la agencia.\n");
                cantidadColaboradores++;
            }

            reporte.append("----------------------------------------\n\n");
        }

        reporte.append("RESUMEN GENERAL\n");
        reporte.append("Guías turísticos: ").append(cantidadGuias).append("\n");
        reporte.append("Vehículos: ").append(cantidadVehiculos).append("\n");
        reporte.append("Colaboradores externos: ")
                .append(cantidadColaboradores).append("\n");
        reporte.append("Total de entidades: ")
                .append(obtenerCantidadEntidades());

        return reporte.toString();
    }
}
