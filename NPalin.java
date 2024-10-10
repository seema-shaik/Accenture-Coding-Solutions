import java.util.*;
public class NPalin 
{
    static int ispal(int num)
    {
        int rev = 0,rem;
        int temp = num;
        while(temp != 0)
        {
            rem = temp%10;
            rev = (rev*10)+rem;
            temp =  temp/10;
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        for(int i = l;i <= r;i++)
        {
            if(i == ispal(i))
                System.out.print(i+" ");
        }
    }
}
