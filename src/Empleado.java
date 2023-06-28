public class Empleado implements Metodos {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public void asignarBono(){
        if (this.edad > 40 ){
            this.salario += 100000;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
