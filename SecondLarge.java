import java.util.*;
public class SecondLarge 
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
        int max = arr[0];
        int second = arr[0];
        for(int i  = 1;i < n;i++)
        {
            if(max > arr[i])
            {
                max = arr[i];
            }
        }
        for(int i = 1;i < n;i++)
        {
            if(arr[i] > second && second != max)
            {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
