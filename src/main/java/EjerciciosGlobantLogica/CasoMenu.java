package EjerciciosGlobantLogica;
import java.util.Scanner;
public class CasoMenu 
{
private Scanner teclado;
private int ArticulosVendidos, ArticulosVendidosTotales;
private double ValorVenta, ValorVentaTotal, PromedioVentas;
        
  public void Inicializar()
  {
     teclado = new Scanner(System.in);
      ArticulosVendidos = 0;
      ArticulosVendidosTotales = 0;
      ValorVenta = 0;
      ValorVentaTotal = 0;
      PromedioVentas = 0;      
  }
  
  public void Menu()
  {
      int opcion = 0;
      do
      {
      System.out.println("SUPERMERCADO");
      System.out.println("Elija una de las siguientes opciones\n 1. Ingresar venta | 2. Informe | 3. Salir ");
      opcion = teclado.nextInt();
      teclado.nextLine();
      if (opcion == 3)
      {
          System.out.println("Hasta luego");
      
      }else
      {
          switch (opcion)
          {
              case 1: IngresarVenta();
              ArticulosVendidosTotales += ArticulosVendidos;
              ValorVentaTotal+= ValorVenta;
             break;
             
              case 2: Informe();
              break;
              
              default: System.out.println("Opción no válida");
              break;
          }
      } 
      }while (opcion !=3);    
  }
  
  public void IngresarVenta()
  {
      System.out.println("INGRESAR VENTAS");
      System.out.println("---------------");
      System.out.println("Ingrese la cantidad de articulos vendidos:");
      ArticulosVendidos = teclado.nextInt();
      System.out.println("Ingrese el valor de la venta:");
      ValorVenta = teclado.nextDouble();
  }
  
  public void Informe()
  {
      System.out.println("INFORME DE VENTAS");
      System.out.println("-----------------");
      System.out.println("El número total de articulos vendidos fue de: " + ArticulosVendidosTotales);
      System.out.println("El valor total de las ventas es de: " + ValorVentaTotal);
      double AVT = ArticulosVendidosTotales;
      PromedioVentas = ValorVentaTotal/AVT;
      System.out.println("El promedio de las ventas fue de: " + Math.round(PromedioVentas));
  }
  
    public static void main(String[] args) 
    {
    CasoMenu CasoMenuNuevo = new CasoMenu();
    CasoMenuNuevo.Inicializar();
    CasoMenuNuevo.Menu();
    }
    
}
