import java.util.*;
public class ReverseEvenSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String num[] = st.split(" ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = Integer.parseInt(num[i]);
        }
        int sum = 0;
        for(int i = n-1;i >= 0;i-= 2)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
