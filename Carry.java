import java.util.*;
public class Carry 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = 0,cnt = 0;
        int t1 = num1,t2 = num2;
        while (t1 != 0 && t2 != 0) 
        {
            int d1 = t1%10;
            int d2 = t2%10;
            if(d1+d2+rem > 9)
            {
                cnt++;
                int sum = d1+d2+rem;
                sum = sum/10;
                rem = sum;
            }   
            t1 = t1/10;
            t2 = t2/10; 
        }
        while(t1!=0)
        {
            int d1=t1%10;
            if((d1+rem)>9)
            {
                cnt++;
                int sum=d1+rem;
                sum=sum/10;
                rem=sum;
            }
            t1=t1/10;
        }
        while(t2!=0)
        {
            int d2=t2%10;
            if((d2+rem)>9)
            {
                cnt++;
                int sum=d2+rem;
                sum=sum/10;
                rem=sum;
            }
            t2=t2/10;
        }
        System.out.println(cnt);
    }
}
