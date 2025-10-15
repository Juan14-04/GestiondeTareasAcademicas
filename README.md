Aplicación de los pilares de la Programación Orientada a Objetos (POO)

La aplicación Gestión de Tareas Académicas fue desarrollada siguiendo los cuatro pilares fundamentales de la Programación Orientada a Objetos (POO): encapsulamiento, abstracción, herencia y polimorfismo.
Estos principios garantizan un código modular, fácil de mantener, reutilizable y con una clara separación de responsabilidades entre sus componentes.

1. Encapsulamiento

El encapsulamiento se implementa en las clases principales del modelo, como Task y Student.
En ambas clases, los atributos se declaran como privados (private), evitando el acceso directo desde otras clases y protegiendo así la integridad de los datos.
Para manipular estos atributos, se emplean métodos públicos get y set, que permiten controlar la lectura y modificación de la información de manera segura.

De esta forma, se asegura que cada objeto mantenga un estado coherente, evitando errores producidos por la manipulación externa de sus propiedades.
Este enfoque favorece la seguridad de los datos y la independencia interna de cada clase, principios esenciales en el diseño orientado a objetos.

2. Abstracción

La abstracción se aplica principalmente en las clases de servicio, como TaskService, StudentService y sus respectivas implementaciones.
Estas clases ocultan los detalles internos de la lógica de negocio, tales como la gestión de las listas en memoria, y solo exponen los métodos necesarios para que los controladores (Controllers) puedan interactuar con los datos.

Gracias a este principio, las clases de otros niveles (por ejemplo, el controlador o la capa de presentación) no necesitan conocer cómo se almacenan o procesan las tareas, lo que permite reducir la complejidad del sistema y mejorar la mantenibilidad.
En caso de que se desee implementar una base de datos en el futuro, la estructura actual facilitaría ese cambio sin alterar el resto del código.

3. Herencia

Aunque en este ejercicio la herencia no se aplica de forma explícita, la arquitectura del proyecto está preparada para hacerlo.
Por ejemplo, podría crearse una clase base llamada User que contenga atributos comunes (como nombre, correo o id), de la cual podrían derivarse subclases como Student o Teacher, heredando sus propiedades y comportamientos.

La herencia permitiría reutilizar código y extender funcionalidades sin duplicar lógica, promoviendo una estructura más limpia y escalable.
Este principio sería especialmente útil si el proyecto creciera y requiriera nuevos tipos de entidades o comportamientos especializados.

4. Polimorfismo

El polimorfismo se refiere a la capacidad de un mismo método o interfaz de adoptar diferentes comportamientos según el contexto.
Aunque en la versión actual no se ha implementado de forma directa, el proyecto podría aprovecharlo fácilmente en futuras ampliaciones.

Por ejemplo, podrían definirse distintas subclases de Task, como HomeworkTask, ExamTask o ProjectTask, cada una con su propia implementación del método calcularPuntaje() o mostrarDetalle().
De esta manera, se podría invocar el mismo método desde la interfaz común, obteniendo resultados distintos según el tipo de tarea.

Este principio proporciona flexibilidad y extensibilidad al código, permitiendo agregar nuevas funcionalidades sin modificar el comportamiento existente.
