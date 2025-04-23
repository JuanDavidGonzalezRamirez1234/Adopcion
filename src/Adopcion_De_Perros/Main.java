package Adopcion_De_Perros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Persona persona = null;
        Perro perro1 = null, perro2 = null, perro3 = null;

        int opcion;

        do {
            System.out.println("TIENDA DE ADOPCION");
            System.out.println("Selecciona una de las 5 opciones");
            System.out.println("1. Registrar persona");
            System.out.println("2. Registrar perro");
            System.out.println("3. Adoptar perro");
            System.out.println("4. Consultar el perro más mayor");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingresa la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingresa tu documento: ");
                    String documento = scanner.nextLine();
                    persona = new Persona(nombre, apellido, edad, documento);
                    System.out.println("Se registró exitosamente");
                }
                case 2 -> {
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese nombre del perro: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Ingrese la edad del perro: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el tamaño del perro: ");
                    String tamaño = scanner.nextLine();

                    if (perro1 == null) {
                        perro1 = new Perro(placa, nombre, raza, edad, tamaño);
                    } else if (perro2 == null) {
                        perro2 = new Perro(placa, nombre, raza, edad, tamaño);
                    } else if (perro3 == null) {
                        perro3 = new Perro(placa, nombre, raza, edad, tamaño);
                    } else {
                        System.out.println("No se pudo registrar más perros.");
                    }
                }
                case 3 -> {
                    if (persona == null || (perro1 == null && perro2 == null && perro3 == null)) {
                        System.out.println("Debe registrar una persona y al menos un perro antes de adoptar.");
                        continue;
                    }

                    System.out.print("Ingrese placa del perro a adoptar: ");
                    String placa = scanner.nextLine();
                    Perro perroAdoptado = null;

                    if (perro1 != null && perro1.getPlaca().equals(placa)) {
                        perroAdoptado = perro1;
                        perro1 = null;
                    } else if (perro2 != null && perro2.getPlaca().equals(placa)) {
                        perroAdoptado = perro2;
                        perro2 = null;
                    } else if (perro3 != null && perro3.getPlaca().equals(placa)) {
                        perroAdoptado = perro3;
                        perro3 = null;
                    }

                    if (perroAdoptado != null) {
                        if (persona.adoptarPerro(perroAdoptado)) {
                            System.out.println("Adopción exitosa");
                        } else {
                            System.out.println("La persona ya alcanzó el límite de adopciones.");
                        }
                    } else {
                        System.out.println("Perro no encontrado o ya adoptado.");
                    }
                }
                case 4 -> {
                    if (persona == null) {
                        System.out.println("Debe primero registrarse la persona");
                        continue;
                    }
                    Perro perroMasViejo = persona.perroMasGrande();
                    if (perroMasViejo != null) {
                        System.out.println("El perro más viejo fue adoptado: " + perroMasViejo);
                    } else {
                        System.out.println("No se ha adoptado un perro");
                    }
                }
                case 5 -> System.out.println("Saliendo de la tienda de adopción");
                default -> System.out.println("Opción no validada");
            }
        } while (opcion != 5);
    }
}