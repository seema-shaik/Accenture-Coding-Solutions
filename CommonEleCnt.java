import java.util.*;
public class CommonEleCnt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int cnt = 0;
        for(int i = 0;i < n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i  = 0;i < m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        boolean comm1[] = new boolean[n];
        boolean comm2[] = new boolean[m];
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                if(arr1[i] == arr2[j])
                   {
                        comm1[i] = true;
                        comm2[j] = true;
                   }
            }
        }
        for(int i = 0;i < n;i++)
        {
            if(!comm1[i])
            {
                System.out.print(arr1[i]+" ");
                cnt++;
            }
        }
        for(int j = 0;j < m;j++)
        {
            if(!comm2[j])
            {
                System.out.print(arr2[j]+" ");
                cnt++;
            }
        }
        System.out.println("\n"+cnt);
    }
}
