package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x,y,z;
        x=10;
        y=11;
        z=x+y;
        System.out.println("He Java "+z);
        Scanner input=new Scanner(System.in);
        String var=input.nextLine();
        System.out.println("vous avez ecris "+var);
    }
}