public class LeapYearWhile {

    public static void main(String[] args) {
        int year = 2000;
        int count = 0;
        do {
            if (year % 4 == 0 && year % 100 != 0){
                System.out.println(year);
                count++;
            } else if (year % 400 == 0) {
                System.out.println(year);
                count++;
            }
            year++;
        } while (year < 2100);
        System.out.println("Between year 2000 and 2100 are " + count + " leap years");
    }
}
