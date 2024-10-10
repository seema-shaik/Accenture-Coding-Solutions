import java.util.*;
public class ZeroAtEnd 
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
        int temp[] = new int[n];
        int j = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] != 0)
                temp[j++] = arr[i];
        }
        while(j < n)
        {
            temp[j++] = 0;
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
