/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<estacion> misestaciones = new ArrayList<estacion>();
		ArrayList<Bus> misBuses = new ArrayList<Bus>();
		estacion estacion1 = new estacion("Av norte 1", false);
		estacion estacion2 = new estacion("Av norte 2", false);
		estacion estacion3 = new estacion("Av sur 1", true);
		estacion estacion4 = new estacion("Av sur 2", true);
		estacion estacion5 = new estacion("Av sur 3 1", false);
		misestaciones.add(estacion1);
		misestaciones.add(estacion2);
		misestaciones.add(estacion3);
		misestaciones.add(estacion4);
		misestaciones.add(estacion5);
		
		misBuses.add(mibus1);
		misBuses.add(mibus2);
		
		
		Bus mibus1 = new Bus("G14");
		Bus mibus2 = new Bus("G15");
		
		mibus1.AgregarEstacion(estacion1);
		mibus1.AgregarEstacion(estacion2);
		mibus1.AgregarEstacion(estacion3);
		
		
		mibus2.AgregarEstacion(estacion3);
		
		mibus2.AgregarEstacion(estacion4);
		
		mibus2.AgregarEstacion(estacion5);
		
		Scanner input = new Scanner(System.in);
        int opcion = 0;
		do{
		    System.out.println("---MENU---");
		    System.out.println("---1. Digitar la ruta de bus para conocer sus paradas ---");
		    
		    System.out.println("---2. Conocer Rutas que trabajan en feriados ---");
		    System.out.println("---3. Para Salir");
		    opcion = input.nextInt(); 
		    switch(option) {
                 
                  case 1:
                      System.out.println("---Digite la ruta del bus");
                      String ruta = input.nextLine();
                      for(int i = 0; i < misBuses.length; i++){
                            if(misBuses[i].nombreEstacion.equals(ruta)){
                                misBuses[i].ConsultarEstaciones();
                            }
                        }
                      
                      
                  case 2:
                      for(int i = 0; i < misestaciones.length; i++){
                            if(misestaciones[i].abreFeriados == true){
                                System.out.println("La estacion: "+misestaciones[i].nombreEstacion+" Abre feriado");
                            }
                        }
                      
                    break;
                  case 3:
                    System.out.println("Muchas gracias por usar nuestro servicio");
                    break;
                  default:
                    System.out.println("Numero invalido, por favor digite nuevamente");
                    break;
                }
		}while(opcion != 4);
	}
}

 class Bus{
    public String numRuta;
    public ArrayList<estacion> misestaciones = new ArrayList<estacion>();
    
    //Methods
    public void ConsultarEstaciones(){
        for(int i = 0; i < misestaciones.length; i++){
            System.out.println("Las estaciones del bus son: "+misestaciones[i].nombreEstacion);
        }
    }
    public void AgregarEstacion(estacion miestacion){
        misestaciones.add(miestacion);
    }
    
}

class estacion{
    //Atributes
    boolean abreFeriados;
    String nombreEstacion;
    
    //Constructor
    public estacion(String nombreestacion, boolean abreferiados){
        abreFeriados = abreferiados;
        nombreEstacion = nombreestacion;
    }
}