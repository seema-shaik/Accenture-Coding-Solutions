import java.util.*;
public class Missing 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0, expectedsum = 0;
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sum = n*(n+1)/2;
        for(int i = 0;i < n-1;i++)
        {
            expectedsum += arr[i];
        }
        System.out.println(sum-expectedsum);
    }
}
