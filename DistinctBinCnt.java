import java.util.*;
public class DistinctBinCnt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1,b = 1;
        for(int i = 1;i < n;i++)
        {
            int res = a+b;
            b = a;
            a = res;
        }
        System.out.println((a+b)%1000000007);
    }
}
