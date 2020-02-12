import java.util.Scanner;
class Penktas {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Parasykite skaiciu nuo 1 iki 7: ");
		int day = in.nextInt();
		
		System.out.println(getDayName(day));
	}
	
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1: dayName = "Pirmadienis"; break;
		case 2: dayName = "Antradienis"; break;
		case 3: dayName = "Treciasdienis"; break;
		case 4: dayName = "Ketvirtadienis"; break;
		case 5: dayName = "Penktadienis"; break;
		case 6: dayName = "Sestadienis"; break;
		case 7: dayName = "Sekmadienis"; break;
		default: dayName = "Netinkamas skaicius";
		}
		
		return dayName;
	}
}