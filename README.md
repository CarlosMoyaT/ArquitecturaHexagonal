# ArquitecturaHexagonal
Pequeño proyecto TODOLIST (un programa para crear, leer, actualizar y borrar listas de tareas, asi como obtener informacion adicional) desde una API externa, aplicando arquitectura hexagonal donde quiero aprender más sobre este patrón, aplicando las distintas capas de dicho diseño, separandolas haciendo que cualquier cambio o modificacion sobre una, no afecte al resto, facilitando también la escalabilidad, adaptabilidad, y mantenibilidad de la aplicacion.
También he aprendido y me parece interesante, como este tipo de arquitectura se adhiere a los principios SOLID que basicamente y muy resumido son:

S – Single Responsibility Principle (SRP)
O – Open/Closed Principle (OCP)
L – Liskov Substitution Principle (LSP)
I – Interface Segregation Principle (ISP)
D – Dependency Inversion Principle (DIP)

Esto permite crear un software robusto y estable, un codigo limpio y flexible a los cambios y permite la escalabilidad de manera agil.

También he aprendido sobre las ventajas de separar la lógica de negocio, del lado del usuario y el lado del servidor, y el beneficio de la creación de interfaces que tiene este tipo de arquitectura.
Seguiré profundizando en varios patrones de arquitectura para aprender más en que casos suelen ir mejor unos u otros, y seguiré aprendiendo sobre arquitectura hexagonal.

Para simular las peticiones desde adapters utilizo los siguientes enlaces , https://jsonplaceholder.typicode.com/todos/ y https://jsonplaceholder.typicode.com/users/

Para continuar pretendo refactorizar lo que pueda para hacer más sencillo el código y legible, también quiero añadir algunas funcionalidades extra más adelante.


IMPLEMENTAR EN UN FUTURO

-Interfaz gráfica de usuario
