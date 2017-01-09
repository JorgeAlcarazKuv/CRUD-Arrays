import java.util.Scanner;
/**
 * CRUD hecho con Arrays
 * @author Jorge Alcaraz
 */
public class CRUDMain {
  
  public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    int eleccion;
    boolean salir=false;
    String[] listaMarca = {"intel", "amd", "amd", "intel", "VACIO", "VACIO"};
    while (salir == false) {
      System.out.println("    1- Mostrar lista de procesadores. ");
      System.out.println("    2- Introducir nuevo procesador.");
      System.out.println("    3- Modificar procesador ya existente.");
      System.out.println("    4- Eliminar procesador de la lista.");
      System.out.println("    0- Salir");
      System.out.print("¿Qué quieres hacer? Elige una opción: ");
      eleccion = t.nextInt();
      switch(eleccion) {
        case 0:
          salir = true;
        case 1:
          mostrarLista(listaMarca);
          break;
        case 2:
          introducirDato(listaMarca);
          break;
        case 3:
        // Modificar dato
          break;
        case 4:
        // Eliminar dato
          break;
        default:
      }
    }
  }
  public static void mostrarLista(String lista[]) {
    for (int i=0; i < lista.length; i++) {
      System.out.println(i + ". " + lista[i]);
    }
  }
  public static void introducirDato(String lista[]) {
    Scanner t = new Scanner(System.in);
    String dato;
    System.out.print("Introduce la nueva marca: ");
    dato = t.next();
    boolean introducido=false;
    for (int i=0; i < lista.length &&  introducido != true; i++) {
      if (lista[i] == "VACIO") {
        lista[i] = dato;
        introducido = true;
      }
    }
  }
}
