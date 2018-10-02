import java.util.Scanner;

public class SentenciaIf{
  public static void main(String[] arg){
  String linea;
  
  System.out.println("Le voy a decir si el nº introducido es par o impar.");
  System.out.println("Introduce el numeroº:");
  
  linea = System.console().readLine();
  int numero = Integer.parseInt(linea);
  
  if ((numero % 2) == 0) { //el numero es par
    System.out.printf("El numero %d es par.\n",numero);
    } else {
      System.out.printf("El numero %d es impar.\n",numero);

      }
  
  }
}
