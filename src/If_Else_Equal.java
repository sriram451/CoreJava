import java.util.Scanner;

public class If_Else_Equal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 == num2)
        {
            System.out.println("Both numbers are Equal");
        }
        else
        {
            System.out.print("Not Equal");
        }
    }
}
