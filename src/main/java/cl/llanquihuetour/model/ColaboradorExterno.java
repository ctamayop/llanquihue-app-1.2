package cl.llanquihuetour.model;

public class ColaboradorExterno extends RecursoAgencia {

    private String nombre;
    private String especialidad;
    private String empresa;

    public ColaboradorExterno(boolean activo, String nombre,
                              String especialidad, String empresa) {
        super(activo);
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Nombre: " + nombre + "\n"
                + "Especialidad: " + especialidad + "\n"
                + "Empresa: " + empresa + "\n"
                + "Estado: " + obtenerEstado() + "\n";
    }
}
