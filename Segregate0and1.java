import java.util.*;
public class Segregate0and1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int l = 0,r = n-1;
        while(l < r)
        {
            while(arr[l] == 0 && l < r)
                l++;
            while(arr[r] == 1 && l < r)
                r--;
            if(l < r)
            {
                arr[l] = 0;
                arr[r] = 1;
                l++;
                r--;
            }
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
