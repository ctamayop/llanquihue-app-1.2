package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ExcursionCultural;
import cl.llanquihuetour.model.PaseoLacustre;
import cl.llanquihuetour.model.RutaGastronomica;
import cl.llanquihuetour.model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private final List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServiciosDePrueba();
    }

    private void cargarServiciosDePrueba() {
        servicios.add(new RutaGastronomica(
                "Sabores de Puerto Varas",
                4,
                5
        ));

        servicios.add(new RutaGastronomica(
                "Ruta gastronómica de Frutillar",
                3.5,
                4
        ));

        servicios.add(new PaseoLacustre(
                "Navegación por el lago Llanquihue",
                2,
                "Catamarán"
        ));

        servicios.add(new PaseoLacustre(
                "Paseo lacustre por Puerto Octay",
                1.5,
                "Lancha"
        ));

        servicios.add(new ExcursionCultural(
                "Ruta de Iglesias de Chiloé",
                6,
                "Iglesias patrimoniales de Chiloé"
        ));

        servicios.add(new ExcursionCultural(
                "Visita al Museo Alemán",
                2,
                "Museo Colonial Alemán de Frutillar"
        ));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    public String mostrarServicios() {
        StringBuilder resultado = new StringBuilder();

        for (ServicioTuristico servicio : servicios) {
            resultado.append(servicio.toString())
                    .append("\n")
                    .append("----------------------------------------")
                    .append("\n");
        }

        return resultado.toString();
    }
}
