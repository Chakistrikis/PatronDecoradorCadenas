# Proyecto Cadenas con Patron Decorador (Patrones de Diseño - UAM Azc)

---

## 📐 Patrón de Diseño: Patron Decorador + MVC

### 🔸 Modelo (`model/`)
Contiene la lógica de negocio y la estructura de datos.

- `StringUtil.java`: Clase que recibe la cadena desde el input. Implementa el método `getText()`.

### 🔸 Controlador (`controller/`)
Gestiona la interacción entre la Vista y el Modelo.

- `ControladorBebida.java`: Controla todas las operaciones de la app, implementando el método `start()`.

### 🔸 Vista (`view/`)
Interfaz con el usuario.

- `ConsoleView.java`: Muestra la iterfaz en consola para la interacción con el usuario, implementando los métodos `setupConsole()`, `selectOption()`, `inputText()`.

### 🔸 Aplicación (`app/`)
Contiene el punto de entrada del programa.

- `Main.java`: ejecuta la aplicación instanciando la vista y el controlador.

---

📁 Estructura del Proyecto

```
src/
├── model/
│   ├── StringUtil.java
│
├── controller/
│   └── TextController.java
│
├── view/
│   └── ConsoleView.java
│
└── app/
    └── Main.java
```

📝Notas Adicionales: 

 - El programa está implementado de tal manera que el usuario no puede poner entradas incorrectas en el menú principal. Se puede visualizar la impelemtación de dichos métodos en la clase `ConsoleView.java` en el método `selectOption()`.

## 💻IDE y Configuración

- IntelliJ IDEA 2024.3.5
- Java: 16
- Dependencias: No
- Versión: 1.0-SNAPSHOT