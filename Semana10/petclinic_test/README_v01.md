# 🐾 PetClinic - Pruebas Unitarias y Servicios REST (Spring Boot)

Este proyecto forma parte del Laboratorio 10 del curso de Construcción y Pruebas de Software. Contiene la implementación y validación de la capa de servicios (CRUD) para la entidad `Owner` (Propietario) dentro del ecosistema de Spring PetClinic.

Las pruebas están diseñadas utilizando un modelo ágil y se ejecutan sobre una base de datos temporal en memoria, garantizando la integridad de los datos de producción y permitiendo pruebas destructivas seguras.

## 🛠️ Stack Tecnológico
- **Framework Principal:** Spring Boot 3.x
- **Lenguaje:** Java (JDK 21)
- **Pruebas Unitarias:** JUnit 5 (Jupiter API)
- **Persistencia y ORM:** Spring Data JPA / Hibernate
- **Base de Datos de Testing:** H2 (In-Memory Database)
- **Gestión de Dependencias:** Apache Maven (Wrapper)
- **Reducción de Boilerplate:** Lombok
- **Logging:** SLF4J

## ⚙️ Configuración del Entorno

Para que las pruebas se ejecuten correctamente sin afectar una base de datos real, el proyecto utiliza perfiles de configuración de Spring.
Asegúrese de que el archivo `src/main/resources/application.yml` tenga habilitado el perfil de la base de datos H2:
```yaml
spring:
  profiles:
    active: h2