import java.util.*;
public class Peak 
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
        int max = arr[0];
        for(int i = 1;i < n;i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
}
