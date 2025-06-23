# Proyecto Cadenas con Patron Decorador (Patrones de Diseño - UAM Azc)

 - Este proyecto implementa decoraciones (*, -, *) a la cadena ingresada por el usuario.
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

## 📁 Estructura del Proyecto

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

## 💻 Funcionamiento

 - Seleccionas el Patron Decorador que deseas, después ingresas la cadena e imprime la cadena ingresada con el Patron Decorador.

![image](https://github.com/user-attachments/assets/6b24ae19-61bb-4d42-8800-7bd589ad003c)

![image](https://github.com/user-attachments/assets/0cfd803e-f310-4693-9946-d2c0fd7b46ad)

![image](https://github.com/user-attachments/assets/c756ca1c-6bb7-40bb-a929-eef6492135e9)

![image](https://github.com/user-attachments/assets/07d3c5a1-22c7-49d6-a904-abb42db68f8c)

📝Notas Adicionales

 - El programa está implementado de tal manera que el usuario no puede poner entradas incorrectas en el menú principal. Se puede visualizar la impelemtación de dichos métodos en la clase `ConsoleView.java` en el método `selectOption()`.
 - El programa ya cuenta con un bucle (while) para que el programa no finalice hasta que el usuario lo decida.

## 💻 IDE y Configuración

- IntelliJ IDEA 2024.3.5
- Java: 16
- Dependencias: No
- Versión: 1.0-SNAPSHOT
