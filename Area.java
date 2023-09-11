import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int width;
        int height;
        int result;

        System.out.println("write 2 numbers");

        width = input.nextInt();
        height = input.nextInt();

        result = width * height;

        System.out.println("The area is: " + result);

        input.close();
    }
}
hej med jer alle
