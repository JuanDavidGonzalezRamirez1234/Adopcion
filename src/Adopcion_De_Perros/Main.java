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


                }

            }
        }

    }
}