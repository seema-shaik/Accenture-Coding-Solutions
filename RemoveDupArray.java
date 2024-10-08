import java.util.*;
public class RemoveDupArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        int n = st.length;
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = Integer.parseInt(st[i]);
        }
      /*  for(int i = 0; i < n;i++)
        {
            int j;
            for(j = 0;j < n;j++)
            {
                if(arr[i] == arr[j])
                    break;
            }
            if(i == j)
                System.out.print(arr[i]+" ");
        }*/
       Arrays.sort(arr);
        int j = 0;
        for(int i = 1; i < n;i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[++j] = arr[i];
            }
        }
        for(int i = 0;i <= j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
