public class Main {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
                count++;
            }

            i++;

        }

        System.out.println("There are " + count + " numbers that are divided by 4 and 6");
    }
}