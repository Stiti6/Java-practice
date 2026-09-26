import java.util.Scanner;
public class lengthstring{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String text = scanner.nextLine();
        int length = text.length();
        
        System.out.println("The length of the string is: " + length);
    }
}