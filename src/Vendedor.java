public class Vendedor extends Empleado implements Metodos{

    private String fecha_inicio;

    public Vendedor(String nombre, String apellido, int edad, double salario, String fecha_inicio) {
        super(nombre, apellido, edad, salario);
        this.fecha_inicio = fecha_inicio;
    }

    @Override
    public void asignarBono(){
        super.asignarBono();
        this.setSalario( this.getSalario() + 50000 );
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }
}
