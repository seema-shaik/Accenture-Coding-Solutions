import java.util.*;
public class CntNumDig 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int freq1[] = new int[10];
        int freq2[] = new int[10];
        while(n > 0)
        {
            freq1[n%10]++;
            n = n/10;
        }
        while(m > 0)
        {
            freq2[m%10]++;
            m = m/10;
        }
        for(int i  = 0; i < 10;i++)
        {
            if(freq1[i] > 0 & freq2[i] > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
