# Calculator - Pruebas Unitarias Java Standalone

Este proyecto es una aplicación Java Standalone diseñada para demostrar la implementación de pruebas unitarias sobre operaciones aritméticas básicas. Valida la lógica de una calculadora estándar (suma, resta, multiplicación y división) asegurando que cada método maneje correctamente los datos e incorpore un sistema de registro de eventos (logging) para facilitar la depuración.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java 21
- **Gestor de Dependencias:** Apache Maven
- **Framework de Pruebas:** JUnit 5 (Jupiter)
- **Logging:** Apache Log4J 2

## 🚀 Modo de Uso

### Ejecución desde el IDE (IntelliJ IDEA)
1. Abrir la carpeta `cps_lab10` como proyecto en IntelliJ IDEA.
2. Navegar al archivo `src/test/java/pe/edu/tecsup/lab10/CalculatorTest.java`.
3. Hacer clic en el ícono de ejecución (flechas verdes) junto a la declaración de la clase para correr todas las pruebas.
4. Validar que la consola muestre las pruebas en verde y las trazas generadas por Log4J.

### Ejecución por Consola
Abrir una terminal en la raíz del proyecto (`cps_lab10`) y ejecutar el siguiente comando de Maven:
```bash
mvn clean test