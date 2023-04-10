public class EjercicioTema8 {
    public static void main(String[] args) {
        PersonaTema8 personaTema8 = new PersonaTema8();
        personaTema8.setEdad(43);
        personaTema8.setNombre("Luis Turcios");
        personaTema8.setTelefono("50369866023");
        System.out.println("Nombre: " + personaTema8.getNombre());
        System.out.println("Edad: " + personaTema8.getEdad());
        System.out.println("Telefono: " + personaTema8.getTelefono());
    }
}

class PersonaTema8 {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
