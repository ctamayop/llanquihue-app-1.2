package cl.llanquihuetour.model;

public abstract class RecursoAgencia implements Registrable {

    private boolean activo;

    public RecursoAgencia(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String obtenerEstado() {
        return activo ? "Activo" : "Inactivo";
    }

    @Override
    public abstract String mostrarResumen();
}
