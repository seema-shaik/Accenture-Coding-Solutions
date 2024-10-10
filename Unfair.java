import java.util.*;
public class Unfair 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i  = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i <= n-k;i++)
        {
            min = Math.min(min,arr[i+k-1]-arr[i]);
        }
        System.out.println(min);
    }
}
