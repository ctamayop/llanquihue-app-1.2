package cl.llanquihuetour.model;

public class Vehiculo extends RecursoAgencia {

    private String patente;
    private String modelo;
    private int capacidadPasajeros;

    public Vehiculo(boolean activo, String patente,
                    String modelo, int capacidadPasajeros) {
        super(activo);
        this.patente = patente;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String mostrarResumen() {
        return "Patente: " + patente + "\n"
                + "Modelo: " + modelo + "\n"
                + "Capacidad de pasajeros: " + capacidadPasajeros + "\n"
                + "Estado: " + obtenerEstado() + "\n";
    }
}
