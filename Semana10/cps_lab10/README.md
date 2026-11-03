---

### README.md para la carpeta `petclinic_test`

```markdown
# PetClinic - Pruebas Unitarias CRUD con Spring Boot

Este módulo forma parte de una aplicación web basada en el sistema PetClinic. Su objetivo principal es validar la capa de servicios y persistencia de datos mediante pruebas unitarias ágiles. Implementa pruebas para las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de la entidad `Owner` (Propietario), utilizando una base de datos temporal en memoria para garantizar que las pruebas destructivas no afecten los datos de producción.

## 🛠️ Tecnologías Utilizadas
- **Framework Principal:** Spring Boot
- **Lenguaje:** Java 21
- **Pruebas y Aserciones:** JUnit 5
- **Base de Datos de Pruebas:** H2 (In-Memory Database)
- **Utilidades:** Lombok, SLF4J
- **Gestor de Construcción:** Maven Wrapper

## 🚀 Modo de Uso

### Ejecución desde el IDE (IntelliJ IDEA)
1. Abrir la carpeta `petclinic_test` en IntelliJ IDEA.
2. Asegurar que el archivo `src/main/resources/application.yml` tenga el perfil `active: h2`.
3. Navegar a `src/test/java/com/tecsup/petclinic/services/OwnerServiceTest.java`.
4. Ejecutar la clase haciendo clic en las flechas verdes laterales.

### Ejecución por Consola (Windows)
Abrir una terminal en la raíz del proyecto (`petclinic_test`) y utilizar el Maven Wrapper para lanzar los tests de la clase `OwnerServiceTest`:
```powershell
.\mvnw.cmd "-Dtest=com.tecsup.petclinic.services.OwnerServiceTest" clean test