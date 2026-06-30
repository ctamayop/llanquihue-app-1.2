package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ExcursionCultural;
import cl.llanquihuetour.model.PaseoLacustre;
import cl.llanquihuetour.model.RutaGastronomica;
import cl.llanquihuetour.model.ServicioTuristico;

public class GestorServicios {

public ServicioTuristico[] crearServicios(){

    ServicioTuristico[] servicio = new ServicioTuristico[6];

    servicio[0] = new RutaGastronomica("De Puerto Varas a la mesa",4, 4);
    servicio[1] = new RutaGastronomica("Sabores de Chiloe", 5, 6);

    servicio[2] = new PaseoLacustre("Lago todos los santos", 4, "Catamaran");
    servicio[3] = new PaseoLacustre("Paseo lago LLanquihue", 2, "Lancha");

    servicio[4] = new ExcursionCultural("Patrimonio Frutillar", 3, "Museo colonial Alemán");
    servicio[5] = new ExcursionCultural("Ruta de iglesias de Chiloe", 6, "Iglesias patrimoniales de Chiloe");

    return servicio;
     }
}
