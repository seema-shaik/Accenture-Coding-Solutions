import java.util.*;
class ArrayEvenOdd
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
        for(int i = 0;i < n;i++)
        {
            if(arr[i]%2 == 0)
                System.out.print("Even");
            else
                System.out.print("Odd");
        }
    }
}