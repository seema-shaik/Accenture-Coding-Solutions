import java.util.*;
public class SmallestMissingUsingVector 
{
    static int findfirstMiss(int arr[],int n,int m)
    {
        int vec[] = new int[m];
        for(int i = 0;i < n;i++)
        {
            vec[arr[i]] = 1;
        }
        for(int i = 0;i < m;i++)
        {
            if(vec[i] == 0)
                return i;
        }
        return m;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        int len = st.length;
        int arr[] = new int[len];
        for(int i = 0;i < len;i++)
        {
            arr[i] = Integer.parseInt(st[i]);
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findfirstMiss(arr,n,m));   
    }
}
