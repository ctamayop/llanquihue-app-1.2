package cl.llanquihuetour.ui;

import cl.llanquihuetour.data.GestorEntidades;
import cl.llanquihuetour.model.ColaboradorExterno;
import cl.llanquihuetour.model.GuiaTuristico;
import cl.llanquihuetour.model.Vehiculo;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Main {

    private final GestorEntidades gestorEntidades;

    public Main() {
        gestorEntidades = new GestorEntidades();
    }

    // Inicia la interfaz gráfica en el hilo de eventos de Swing.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main aplicacion = new Main();
            aplicacion.iniciar();
        });
    }

    // Muestra el menú principal y procesa la opción seleccionada.
    public void iniciar() {
        int opcion = -1;

        while (opcion != 0) {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    "LLANQUIHUE TOUR\n\n"
                            + "1. Registrar guía turístico\n"
                            + "2. Registrar vehículo\n"
                            + "3. Registrar colaborador externo\n"
                            + "4. Mostrar entidades registradas\n"
                            + "0. Salir\n\n"
                            + "Seleccione una opción:",
                    "Menú principal",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                opcion = 0;
            } else {
                try {
                    opcion = Integer.parseInt(entrada.trim());

                    switch (opcion) {
                        case 1:
                            registrarGuiaTuristico();
                            break;
                        case 2:
                            registrarVehiculo();
                            break;
                        case 3:
                            registrarColaboradorExterno();
                            break;
                        case 4:
                            mostrarEntidades();
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Programa finalizado.",
                                    "Llanquihue Tour",
                                    JOptionPane.INFORMATION_MESSAGE
                            );
                            break;
                        default:
                            mostrarError("Debe seleccionar una opción válida.");
                    }

                } catch (NumberFormatException excepcion) {
                    mostrarError("Debe ingresar un número válido.");
                }
            }
        }
    }

    // Solicita los datos necesarios para registrar un guía turístico.
    private void registrarGuiaTuristico() {
        String nombre = solicitarTexto("Ingrese el nombre del guía:");
        if (nombre == null) {
            return;
        }

        String idioma = solicitarTexto("Ingrese el idioma que domina:");
        if (idioma == null) {
            return;
        }

        Integer aniosExperiencia = solicitarEntero(
                "Ingrese los años de experiencia:",
                0
        );
        if (aniosExperiencia == null) {
            return;
        }

        GuiaTuristico guia = new GuiaTuristico(
                true,
                nombre,
                idioma,
                aniosExperiencia
        );

        gestorEntidades.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente.\n\n"
                        + guia.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void registrarVehiculo() {
        String patente = solicitarTexto("Ingrese la patente:");
        if (patente == null) {
            return;
        }

        String modelo = solicitarTexto("Ingrese el modelo del vehículo:");
        if (modelo == null) {
            return;
        }

        Integer capacidad = solicitarEntero(
                "Ingrese la capacidad de pasajeros:",
                1
        );
        if (capacidad == null) {
            return;
        }

        Vehiculo vehiculo = new Vehiculo(
                true,
                patente,
                modelo,
                capacidad
        );

        gestorEntidades.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente.\n\n"
                        + vehiculo.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void registrarColaboradorExterno() {
        String nombre = solicitarTexto(
                "Ingrese el nombre del colaborador:"
        );
        if (nombre == null) {
            return;
        }

        String especialidad = solicitarTexto(
                "Ingrese la especialidad:"
        );
        if (especialidad == null) {
            return;
        }

        String empresa = solicitarTexto(
                "Ingrese el nombre de la empresa:"
        );
        if (empresa == null) {
            return;
        }

        ColaboradorExterno colaborador = new ColaboradorExterno(
                true,
                nombre,
                especialidad,
                empresa
        );

        gestorEntidades.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                null,
                "Colaborador externo registrado correctamente.\n\n"
                        + colaborador.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Muestra el reporte en una ventana con barra de desplazamiento.
    private void mostrarEntidades() {
        String reporte = gestorEntidades.generarReporte();

        JTextArea areaTexto = new JTextArea(reporte, 22, 45);
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setCaretPosition(0);

        JScrollPane panelDesplazamiento = new JScrollPane(areaTexto);

        JOptionPane.showMessageDialog(
                null,
                panelDesplazamiento,
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private String solicitarTexto(String mensaje) {
        while (true) {
            String texto = JOptionPane.showInputDialog(
                    null,
                    mensaje,
                    "Ingreso de datos",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (texto == null) {
                return null;
            }

            texto = texto.trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            mostrarError("El campo no puede quedar vacío.");
        }
    }

    // Valida que el usuario ingrese un número igual o mayor al mínimo.
    private Integer solicitarEntero(String mensaje, int valorMinimo) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    mensaje,
                    "Ingreso de datos",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                return null;
            }

            try {
                int numero = Integer.parseInt(entrada.trim());

                if (numero >= valorMinimo) {
                    return numero;
                }

                mostrarError(
                        "El número debe ser igual o mayor que "
                                + valorMinimo + "."
                );

            } catch (NumberFormatException excepcion) {
                mostrarError("Debe ingresar un número válido.");
            }
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Dato incorrecto",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
