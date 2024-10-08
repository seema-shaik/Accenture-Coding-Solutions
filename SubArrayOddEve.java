import java.util.*;
public class SubArrayOddEve 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        String bin ="";
        for(int i = l;i <= r;i++)
        {
            bin = bin+st[i];
        }
        int res = Integer.parseInt(bin,2);
        if(res %2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
