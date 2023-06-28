public class Repartidor extends Empleado{

    private String disponibilidad_horaria;

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidad_horaria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidad_horaria = disponibilidad_horaria;
    }

    @Override
    public void asignarBono(){
        super.asignarBono();
        this.setSalario( this.getSalario() + 50000 );
        if( this.getEdad() < 30 ){
            this.setSalario( this.getSalario() + 15000 );
        }
    }

    public String getDisponibilidad_horaria(){
        return this.disponibilidad_horaria;
    }


}
