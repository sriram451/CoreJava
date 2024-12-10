import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Name = in.nextLine();
        int Age = in.nextInt();
        in.nextLine();
        String Address = in.nextLine();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
    }
}
