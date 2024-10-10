import java.util.*;
public class Equllibrium 
{
    static int equi(int arr[],int n)
    {
        if(n == 1)
            return 1;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i < n;i++)
        {
            prefix[i] = prefix[i-1]+arr[i];
        }
        suffix[n-1] = arr[n-1];
        for(int i = n-2;i >= 0;i--)
        {
            suffix[i] = suffix[i+1]+arr[i];
        }
        for(int i = 0;i < n;i++)
        {
            if(prefix[i] == suffix[i])
                return i;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(equi(arr,n));
    }
}
