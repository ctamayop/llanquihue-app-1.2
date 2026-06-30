![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Formativa Semana 6: Creando jerarquías de clases con herencia simple

**Desarrollo Orientado a Objetos I**

## 👤 Autor del proyecto

- **Nombre completo:** Constanza Alejandra Tamayo Pozo
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Sede Online

---

## 📘 Descripción general del sistema

LlanquihueTourApp es un sistema desarrollado en Java para representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

En esta semana se implementa una jerarquía de clases utilizando herencia simple, donde una clase base llamada `ServicioTuristico` contiene los atributos comunes de los servicios, mientras que las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` agregan atributos específicos según el tipo de servicio.

El sistema permite crear servicios turísticos y mostrarlos por consola mediante el método `toString()`.

---

## 🎯 Objetivo de la Semana 6

Implementar una jerarquía de clases con herencia simple, reutilizando atributos comunes desde una superclase y atributos especificos en distintas subclases de servicios turísticos.

---

## 🧠 Conceptos aplicados

- Programación Orientada a Objetos.
- Herencia simple.
- Superclase y subclases.
- Uso de `super(...)` en constructores.
- Encapsulamiento mediante atributos privados.
- Constructores, getters y setters.
- Sobrescritura del método `toString()`.
- Organización modular del proyecto en paquetes.
- Creación de objetos de prueba.
- Uso de arreglos.
- Recorrido con ciclo `for-each`.

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
│       │           │   └── GestorServicios.java
│       │           ├── 📁 model/
│       │           │   ├── ServicioTuristico.java
│       │           │   ├── RutaGastronomica.java
│       │           │   ├── PaseoLacustre.java
│       │           │   └── ExcursionCultural.java
│       │           └── 📁 ui/
│       │               └── Main.java
│       └── 📁 resources/
├── pom.xml
└── README.md
```

##📦 Clases creadas

## Paquete model

## ServicioTuristico.java

Clase base o superclase del sistema. Contiene los atributos comunes de todos los servicios turísticos:

nombre

duracionHoras

Además, incluye constructor, getters, setters y el método toString().

## RutaGastronomica.java

Subclase que hereda de ServicioTuristico. Representa una ruta gastronómica y agrega el atributo:

numeroDeParadas

Utiliza super(...) para inicializar los atributos heredados y sobrescribe el método toString().

## PaseoLacustre.java

Subclase que hereda de ServicioTuristico. Representa un paseo lacustre y agrega el atributo:

tipoEmbarcacion

Utiliza super(...) para inicializar los atributos heredados y sobrescribe el método toString().

## ExcursionCultural.java

Subclase que hereda de ServicioTuristico. Representa una excursión cultural y agrega el atributo:

lugarHistorico

Utiliza super(...) para inicializar los atributos heredados y sobrescribe el método toString().

## Paquete data

## GestorServicios.java

Clase encargada de crear servicios turísticos
En su método principal se crean dos objetos de cada subclase:

2 Rutas gastronómicas

2 Paseos lacustres

2 Excursiones culturales

Estos objetos se almacenan en un arreglo ServicioTuristico.

## Paquete ui

## Main.java

Clase principal del programa.
Se encarga de ejecutar la aplicación, llamar a GestorServicios, obtener los servicios creados y mostrarlos por consola utilizando el método toString().

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

Clonar el repositorio desde GitHub:

git clone https://github.com/ctamayop/llanquihue-app-1.2.git

Abrir el proyecto en IntelliJ IDEA

Ir al paquete:

src/main/java/cl/llanquihuetour/ui/

Ejecutar la clase:

Main.java
Observar en consola la información de los servicios turísticos creados.


---

**Repositorio GitHub:** \ https://github.com/ctamayop/llanquihue-app-1.2.git
**Fecha de entrega:** \ 29/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Formativa 3






