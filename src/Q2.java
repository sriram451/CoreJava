import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        int a, b, c, d, e;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = a*b*c;
        e = a + b + c;
        System.out.println(d/e);

    }
}
