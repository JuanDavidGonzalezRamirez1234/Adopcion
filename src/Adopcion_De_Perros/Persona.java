package Adopcion_De_Perros;

public class Persona extends Perro{
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String nombre, String apellido, int edad, String documento) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro1 = null;
        this.perro2 = null;
        this.perro3 = null;

    }

    public boolean adoptarPerro(Perro perro) {
        if (perro1 == null) {
            perro1 = perro;
            return true;
        } else if (perro2 == null) {
            perro2 = perro;
            return true;

        } else if (perro3 == null) {
            perro3 = perro;
            return true;

        }
        return false;
    }

    public Perro perroMasGrande() {
        Perro mayor = null;
        if (perro1 != null) mayor = perro1;
        if (perro2 != null && (mayor == null || perro2.getEdad() > mayor.getEdad())) mayor = perro2;
        if (perro3 != null && (mayor == null || perro3.getEdad() > mayor.getEdad())) mayor = perro3;
        return mayor;
    }
    @Override
    public String toString(){
        return "Persona {"+
                "Nombre ="+ nombre
                +"Apellido ="+ apellido
                + "Edad ="  + edad +
                "Documento ="+ documento
                + "Perro 1 =" + (perro1 != null ? perro1 : "Ninguno")
                + "Perro 2 =" + (perro2 != null ? perro2 : "Ninguno")
                + "Perro 3 =" + (perro3 != null ? perro3: "Ninguno")+ '}';

    }

    public String getDocumento() {
        return documento;
    }
}
