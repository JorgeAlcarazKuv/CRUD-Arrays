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
    String[] listaDescripcion = {"muy bonito", "no tan bonito", "no esta mal", "ola q ase", "VACIO", "VACIO"};
    String[] listaModelo = {"6000", "420", "270x", "6600", "VACIO", "VACIO"};
    while (salir == false) {
      System.out.println("\n    1- Mostrar lista de procesadores. ");
      System.out.println("    2- Introducir nuevo procesador.");
      System.out.println("    3- Modificar procesador ya existente.");
      System.out.println("    4- Eliminar procesador de la lista.");
      System.out.println("    0- Salir");
      System.out.print("¿Qué quieres hacer? Elige una opción: ");
      eleccion = t.nextInt();
      System.out.println();
      switch(eleccion) {
        case 0:
          salir = true;
        case 1:
          mostrarLista(listaMarca, listaDescripcion, listaModelo);
          break;
        case 2:
          introducirDatoNuevo(listaMarca, listaDescripcion, listaModelo);
          break;
        case 3:
          modificarDato(listaMarca, listaDescripcion, listaModelo);
          break;
        case 4:
          eliminarDato(listaMarca, listaDescripcion, listaModelo);
          break;
        default:
      }
    }
  }
  public static void mostrarLista(String listaMarca[], String listaDescripcion[], String listaModelo[]) {
    System.out.printf("%3s %6s %6s %20s\n", "id", "Marca", "Modelo", "Descripcion");
    for (int i=0; i < listaMarca.length; i++) {
      System.out.printf("%2d. %6s %6s %20s\n", i, listaMarca[i], listaModelo[i], listaDescripcion[i] );
    }
  }
  public static void introducirDatoNuevo(String listaMarca[], String listaDescripcion[], String listaModelo[]) {
    Scanner t = new Scanner(System.in);
    int posLibre = 0;
    boolean encontrado=false;
    for (int i=0; i < listaMarca.length &&  encontrado != true; i++) {
      if (listaMarca[i] == "VACIO") {
        posLibre = i;
        encontrado = true;
      }
    }
    meterDato(listaMarca, listaDescripcion, listaModelo, posLibre);
  }
  public static void modificarDato(String listaMarca[], String listaDescripcion[], String listaModelo[]) {
    Scanner t = new Scanner(System.in);
    int pos;
    System.out.println("Introduce la posicion del dato que quieras modificar: ");
    pos = t.nextInt();
    System.out.println("Este es el dato que vas a modificar: \n" + pos + " - " + listaMarca[pos] + " - "
      + listaModelo[pos] + " - " + listaDescripcion[pos]);
    System.out.println("Sustituir por: ");
    meterDato(listaMarca, listaDescripcion, listaModelo, pos);
    System.out.println("Sustituido!");
  }
    public static void eliminarDato(String listaMarca[], String listaDescripcion[], String listaModelo[]) {
    Scanner t = new Scanner(System.in);
    int pos;
    System.out.println("Introduce la posicion del dato que quieras eliminar: ");
    pos = t.nextInt();
    System.out.println("Este es el dato que has eliminado: \n" + pos + " - " + listaMarca[pos] + " - "
      + listaModelo[pos] + " - " + listaDescripcion[pos]);
    listaMarca[pos] = "VACIO";
    listaModelo[pos] = "VACIO";
    listaDescripcion[pos] = "VACIO";
  }
    public static void meterDato(String listaMarca[], String listaDescripcion[], String listaModelo[], int posLibre) {
    Scanner t = new Scanner(System.in);
    System.out.println("Introduce la nueva marca: ");
    listaMarca[posLibre] = t.nextLine();
    System.out.println("Introduce el modelo: ");
    listaModelo[posLibre] = t.nextLine();
    System.out.println("Introduce la descripcion: ");
    listaDescripcion[posLibre] = t.nextLine();
  }
}
