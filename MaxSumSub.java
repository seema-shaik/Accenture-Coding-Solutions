import java.util.*;
public class MaxSumSub 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max_sum = Integer.MIN_VALUE,curr_sum;
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i < n;i++)
        {
            curr_sum = 0;
            for(int j = i;j < n;j++)
            {
                curr_sum += arr[j];
                max_sum = Math.max(max_sum, curr_sum);
            }
        }
        System.out.println(max_sum);
    }
}
