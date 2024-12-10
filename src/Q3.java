import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Name, Department;
        double Score = in.nextDouble();
        in.nextLine();
        Name = in.nextLine();
        Department = in.nextLine();
        System.out.println("My Name: " + Name);
        System.out.println("My Department: " + Department);
        System.out.println("My Score: " + Score/10 + "/10");




    }
}
