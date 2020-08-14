package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
      double moyen;
      Scanner input =new Scanner(System.in);
      System.out.println("quel est votre moyen general");
      moyen=input.nextDouble();
      if(moyen>= 10.0)
      System.out.println("valide");
      else 
      System.out.println("no valide");
    }
}