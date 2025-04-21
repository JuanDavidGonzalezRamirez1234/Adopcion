package Adopcion_De_Perros;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Persona persona = null;
        Perro perro1 = null,perro2 = null, perro3 = null;

        int opcion;

        do{
            System.out.print("ADOPCION");
            System.out.print("Selecciona una de la 5 opciones");
            System.out.print("1. Registrar persona");
            System.out.print("2. Registrar perro");
            System.out.print("3. Adoptar perro");
            System.out.print("4. Consultar el perro mas mayor");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1 ->{
                    System.out.print("Ingresa el nombre:" );
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el apellido");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingresa la edad");
                    int edad = scanner.nextInt();
                    System.out.print("Ingresa tu documento");
                    String documento = scanner.nextLine();
                    persona = new Persona(nombre, apellido, edad, documento);
                    System.out.print("Se regitrso exitosamente");
                }
                case 2 ->{
                    System.out.print("Ingrese la placa");
                    String placa = scanner.nextLine();
                    System.out.print("Ingese nombre del perro");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la raza");
                    String raza = scanner.nextLine();
                    System.out.print("Ingrese la edad del perro");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el Tamaño del perro");
                    String tamaño = scanner.nextLine();

                    if (perro1 == null){
                        perro1 = new Perro(placa, nombre, raza, edad, tamaño);

                    } else if (perro2 == null) {
                        perro2 = new Perro(placa, nombre, raza, edad, tamaño);

                    }else if (perro3 == null){
                        perro3 = new Perro(placa, nombre, raza, edad, tamaño);

                    }else{
                        System.out.print("No se pudo resgistrar");
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
                                System.out.println("¡Adopción exitosa!");
                            } else {
                                System.out.println("La persona ya alcanzó el límite de adopciones.");
                            }
                        } else {
                            System.out.println("Perro no encontrado o ya adoptado.");
                        }

                    }
                    case 4 ->{
                    if (persona == null){
                        System.out.print("Debe primero registrarse la persona");
                        continue;
                    }
                    Perro PerroMasViejo = persona.perroMasGrande();
                    if (PerroMasViejo != null){
                        System.out.print("El perro mas viejo fue adoptado: "+ PerroMasViejo);


                    }
                    }

            }
        }

    }
}