![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Sumativa Semana 8: Interfaces y integración con colecciones genéricas

**Desarrollo Orientado a Objetos I**

## 👤 Autor del proyecto

- **Nombre completo:** Constanza Alejandra Tamayo Pozo
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Sede Online

---

## 📘 Descripción general del sistema

LlanquihueTourApp es una aplicación desarrollada en Java para apoyar la gestión de la agencia de turismo Llanquihue Tour.

El sistema permite registrar y visualizar diferentes entidades utilizadas por la agencia, como guías turísticos, vehículos y colaboradores externos. Todas estas entidades comparten un comportamiento común mediante la interfaz `Registrable`.

La aplicación utiliza herencia, interfaces, polimorfismo, colecciones genéricas y el operador `instanceof` para identificar cada tipo de entidad y aplicar un comportamiento específico.

Además, incluye una interfaz gráfica desarrollada con `JOptionPane`, mediante la cual el usuario puede ingresar datos, registrar entidades y visualizar un reporte con toda la información almacenada.

El proyecto también conserva la jerarquía de servicios turísticos desarrollada en las semanas anteriores, compuesta por rutas gastronómicas, paseos lacustres y excursiones culturales.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 llanquihuetourapp/
├── 📁 src/
│   └── 📁 main/
│       ├── 📁 java/
│       │   └── 📁 cl/
│       │       └── 📁 llanquihuetour/
│       │           ├── 📁 data/
│       │           │   ├── GestorEntidades.java
│       │           │   └── GestorServicios.java
│       │           ├── 📁 model/
│       │           │   ├── Registrable.java
│       │           │   ├── RecursoAgencia.java
│       │           │   ├── GuiaTuristico.java
│       │           │   ├── Vehiculo.java
│       │           │   ├── ColaboradorExterno.java
│       │           │   ├── ServicioTuristico.java
│       │           │   ├── RutaGastronomica.java
│       │           │   ├── PaseoLacustre.java
│       │           │   └── ExcursionCultural.java
│       │           └── 📁 ui/
│       │               └── Main.java
│       └── 📁 resources/
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🧩 Clases e interfaces utilizadas

### `Registrable`

Interfaz que define el comportamiento común de las entidades gestionadas por el sistema.

Declara el método:

```java
String mostrarResumen();
```

Este método no se implementa dentro de la interfaz, ya que cada clase entrega su propia versión del resumen.

---
### `RecursoAgencia`

Clase abstracta que funciona como superclase de las entidades de la agencia.

Contiene el atributo común:

- `activo`

También implementa la interfaz `Registrable` y declara el método abstracto `mostrarResumen()`.

---

### `GuiaTuristico`

Representa a un guía turístico de la agencia.

Sus atributos son:

- `nombre`
- `idioma`
- `aniosExperiencia`
- `activo`, heredado desde `RecursoAgencia`

Implementa su propia versión del método `mostrarResumen()`.

---

### `Vehiculo`

Representa un vehículo utilizado para transportar pasajeros.

Sus atributos son:

- `patente`
- `modelo`
- `capacidadPasajeros`
- `activo`, heredado desde `RecursoAgencia`

Implementa su propia versión del método `mostrarResumen()`.

---

### `ColaboradorExterno`

Representa a una persona o empresa externa que presta servicios a la agencia.

Sus atributos son:

- `nombre`
- `especialidad`
- `empresa`
- `activo`, heredado desde `RecursoAgencia`

Implementa su propia versión del método `mostrarResumen()`.

---

### `GestorEntidades`

Clase encargada de administrar las entidades registradas.

Utiliza la siguiente colección:

```java
ArrayList<Registrable>
```
Sus funciones principales son:

- Agregar entidades.
- Obtener la cantidad total de registros.
- Recorrer la colección con un ciclo `for-each`.
- Diferenciar las entidades mediante `instanceof`.
- Generar un reporte general.

---

### `ServicioTuristico`

Clase abstracta que representa los datos comunes de los servicios turísticos.

Sus atributos son:

- `nombre`
- `duracionHoras`

Declara el método abstracto `mostrarInformacion()`.

---

### `RutaGastronomica`

Subclase de `ServicioTuristico`.

Su atributo específico es:

- `numeroDeParadas`

Representa recorridos relacionados con gastronomía local.

---

### `PaseoLacustre`

Subclase de `ServicioTuristico`.

Su atributo específico es:

- `tipoEmbarcacion`

Representa recorridos turísticos realizados por el lago.

---

### `ExcursionCultural`

Subclase de `ServicioTuristico`.

Su atributo específico es:

- `lugarHistorico`

Representa actividades relacionadas con lugares culturales o patrimoniales.

---

### `GestorServicios`

Clase encargada de crear y administrar diferentes servicios turísticos.

Permite almacenar objetos de las subclases utilizando referencias del tipo `ServicioTuristico`.

---

### `Main`

Clase principal de la aplicación.

Contiene:

- El método `main`.
- El menú gráfico.
- El registro de guías turísticos.
- El registro de vehículos.
- El registro de colaboradores externos.
- La visualización de entidades.
- La validación de campos vacíos.
- La validación de valores numéricos.

---
## ▶️ Instrucciones para ejecutar el programa

1. Descargar o clonar el repositorio.

2. Abrir la carpeta del proyecto en IntelliJ IDEA.

3. Esperar a que IntelliJ cargue y sincronice el archivo `pom.xml`.

4. Verificar que el proyecto utilice un JDK compatible con Java 23.

5. Abrir la clase principal ubicada en:

```plaintext
src/main/java/cl/llanquihuetour/ui/Main.java
```

6. Ejecutar el método:

```java
public static void main(String[] args)
```

7. También se puede ejecutar presionando el triángulo verde que aparece junto a la clase `Main`.

8. Al iniciar la aplicación se mostrará el siguiente menú:

```plaintext
LLANQUIHUE TOUR

1. Registrar guía turístico
2. Registrar vehículo
3. Registrar colaborador externo
4. Mostrar entidades registradas
0. Salir
```

9. Seleccionar una opción e ingresar los datos solicitados.

10. Utilizar la opción `4` para visualizar el reporte completo de las entidades registradas.

---


**Repositorio GitHub:** \ https://github.com/ctamayop/llanquihue-app-1.2.git
**Fecha de entrega:** \ 13/07/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa 3






