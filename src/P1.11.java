import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Introduce tu nombre:");

    String nombre = myObj.nextLine(); 

    System.out.println("Hola " + nombre);
    System.out.println("Este programa está hecho en el lenguaje de programación: Java");
  }
}
