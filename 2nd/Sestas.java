import java.util.Scanner;
class Sestas {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Parasykite slankiojo kablelio skaiciu: ");
        double x = in.nextDouble();
        System.out.print("Parasykite kita slankiojo kablelio skaiciu: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("Skaiciai tokie patys");
        }
        else
        {
            System.out.println("Skaiciai skirtingi");
        }
    }
}