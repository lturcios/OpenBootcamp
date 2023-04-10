public class EjercicioTema9 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Luis Turcios");
        persona.setEdad(43);
        persona.setTelefono("+50369866023");
        persona.mostrar();
        System.out.println("---------------");

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setEdad(42);
        cliente.setTelefono("+50369866023");
        cliente.setCredito(4000.0);
        cliente.mostrar();
        System.out.println("---------------");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Julio Torres");
        trabajador.setEdad(41);
        trabajador.setTelefono("+50369866023");
        trabajador.setSalario(420.75);
        trabajador.mostrar();
        System.out.println("---------------");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    void mostrar() {
        System.out.println("Mi nombre es: " + this.nombre);
        System.out.println("Mi edad es: " + this.edad);
        System.out.println("Mi número de teléfono es: " + this.telefono);
    }
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

class Cliente extends Persona {
    private double credito;

    void mostrar() {
        System.out.println("Mi nombre es: " + this.getNombre());
        System.out.println("Mi edad es:" + this.getEdad());
        System.out.println("Mi número de teléfono es: " + this.getTelefono());
        System.out.println("Mi crédito es: $" + this.credito);
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    void mostrar() {
        System.out.println("Mi nombre es: " + this.getNombre());
        System.out.println("Mi edad es:" + this.getEdad());
        System.out.println("Mi número de teléfono es: " + this.getTelefono());
        System.out.println("Mi salario es: $" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}