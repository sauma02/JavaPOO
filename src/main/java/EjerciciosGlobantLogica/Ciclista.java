package EjerciciosGlobantLogica;
import java.util.Scanner;
public class Ciclista  
{
private Scanner teclado;
private int Tiempo, TotalTiempo, PromedioTiempo, Contador, cont;
private double KmsRecorridos, TotalKmsRecorridos, PromedioKms;

public void Inicializar()
{
    teclado = new Scanner(System.in);
    Tiempo = 0;
    TotalTiempo = 0;
    PromedioTiempo = 0;
    KmsRecorridos = 0;
    TotalKmsRecorridos = 0;
    PromedioKms = 0;
    Contador = 0;
    cont = 0;
}

public void Menu()
{
    int opcion = 0;
    do 
    {
        System.out.println("SEGUIMIENTO RECORRIDOS CICLA");
        System.out.println("----------------------------");
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Registrar recorrido | 2. Informe | 3. Salir");
        opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion==3)
        {
            System.out.println("HASTA LUEGO");
        }else
        {
            switch(opcion)
            {
                case 1: RegistrarRecorridos();
                Contador++;
                TotalKmsRecorridos += KmsRecorridos;
                TotalTiempo += Tiempo;
                break;
                
                case 2: Informe();
                break;
                
                default: System.out.println("Opción no válida, intentelo de nuevo");           
            }
        }
    }while(opcion != 3);
}

public void RegistrarRecorridos()
{
    System.out.println("REGISTRAR RECORRIDO DEL DÍA");
    System.out.println("---------------------------");
    System.out.println("Ingrese el tiempo del recorrido en minutos");
    Tiempo = teclado.nextInt();
    System.out.println("Ingrese los kilometros recorridos");
    KmsRecorridos = teclado.nextDouble();
     if(KmsRecorridos>=20){
     
         for (double i = 1; i < KmsRecorridos; i=20) {
        cont = cont + 5;
    }
    }
  
}

public void Informe()
{
     
    System.out.println("INFORME DE RECORRIDOS");
    System.out.println("----------------------");
    System.out.println("El total de Kilometros recorridos es de: " + TotalKmsRecorridos);
   
   
    System.out.println("El total de tiempo recorrido en minutos es de: " + TotalTiempo);
    PromedioTiempo = TotalTiempo / Contador;
    System.out.println("El promedio de tiempo recorrido es de: " + PromedioTiempo);
    double C = Contador;
   
    PromedioKms = TotalKmsRecorridos / C;
    System.out.println("El promedio de kilometros recorridos es de: " + PromedioKms);
    System.out.println("Cantidad de dias recorridos: " + Contador);
    System.out.println("La experiencia es de: "+cont);
  
  
   
    }

    public static void main(String[] args) 
    {
    Ciclista CiclistaNuevo = new Ciclista();
    CiclistaNuevo.Inicializar();
    CiclistaNuevo.Menu();
    }
    
}
