import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Parasykite savo varda: ");
    String fname = input.next();
    System.out.print("Parasykite pavarde: ");
    String lname = input.next();
    System.out.println();
    System.out.println("Labas \n"+fname+" "+lname);
  }
}