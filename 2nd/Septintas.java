import java.util.Scanner;
class Septintas {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "Sausis";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Vasaris";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "Kovas";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "Balandis";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "Geguze";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Birzelis";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "Liepa";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "Rugpjutis";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "Rugsejis";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Spalis";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "Lapkritis";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "Gruodis";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}