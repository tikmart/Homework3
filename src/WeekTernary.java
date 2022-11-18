import java.util.Scanner;

public class WeekTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input day number: ");
        int dayNum = sc.nextInt();

        String dayName = dayNum == 1 ? "Monday" : dayNum == 2 ? "Tuesday" : dayNum == 3 ? "Wednsday" : dayNum == 4 ? "Thursday" : dayNum == 5 ? "Friday" : dayNum == 6 ? "Saturday" : dayNum == 7 ? "Sunday" : "Not a valid day";

        System.out.println(dayName);
    }
}
