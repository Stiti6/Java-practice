import java.util.Scanner;
public class stringcopy{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        String str2 = str1;


        System.out.println("Original String:" +str1);
        System.out.println("Copied String:" +str2);

    }
}