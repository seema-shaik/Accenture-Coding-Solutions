import java.util.*;
public class LeftRotate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String st[] = s.split(" ");
        int n = st.length;
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = Integer.parseInt(st[i]);
        }
        for(int i = d;i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < d;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
