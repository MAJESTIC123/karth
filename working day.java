import java.util.Scanner;
public class Day{
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
   System.out.println("Enter the day");
    String day=s.nextLine();
    if(day.equalsIngnoreCase("Monday")||day.equalsIngnoreCase("Tuesday")||day.equalsIngnoreCase("Wednesday")||day.equalsIngnoreCase("Thursday")||day.equalsIngnoreCase("Friday")){
        System.out.println("True");
    }
 else{
  System.out.println("False");
 }
    }

}
