import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteSingle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        try{
            FileWriter fw = new FileWriter("data.txt");

            fw.write(value);

            fw.close();

            System.out.println("Value written successfully to the file.");

        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
        }

        sc.close();
    }
}