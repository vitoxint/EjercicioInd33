import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> lista = new ArrayList<>();

        Empleado v1 = new Vendedor("Miguel" , "Toro" , 41 , 500000 ,"2010-01-01");
        v1.asignarBono();

        System.out.println(v1.getSalario());

        Empleado r1 = new Repartidor("Karla" , "Gutierrez" , 25 , 650000 ,"Lunes a Viernes 18:00 a 22:00 hr");
        r1.asignarBono();

        System.out.println(r1.getSalario());


    }
}
