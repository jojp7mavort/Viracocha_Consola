public class Estudiante {
    public String documentoIdentidad;
    public String primerNombre;
    public String primerApellido;
    public int edad;

    public Estudiante(String documentoIdentidad, String primerNombre, String primerApellido, int edad) {
        this.documentoIdentidad = documentoIdentidad;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Documento: " + documentoIdentidad + ", Nombre: " + primerNombre + ", Apellido: " + primerApellido + ", Edad: " + edad;
    }
}
