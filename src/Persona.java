public class Persona {
    String nombre;
    String apellido;
    String dni;
    int anioNacimiento;
    String paisDeNacimiento;
    char genero;


    public Persona(String nombre, String apellido, String dni, int anioNacimiento, String paisDeNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anioNacimiento = anioNacimiento;
        this.paisDeNacimiento = paisDeNacimiento;
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = "+ apellido);
        System.out.println("Número de documento de identidad = " +
                dni);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("Pais de nacimiento = "+paisDeNacimiento);
        System.out.println("Genero = "+genero);
    }
}
