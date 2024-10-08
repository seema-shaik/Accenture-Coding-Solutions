import java.util.*;
public class SmallestMissing 
{
    static int findfirstMiss(int arr[],int st,int end)
    {
        if(st > end)
            return end+1;
        if(st != arr[st])
            return st;
        int mid = (st+end)/2;
        if(mid == arr[mid])
            return findfirstMiss(arr, mid+1, end);
        return findfirstMiss(arr, st, mid);
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
        System.out.println(findfirstMiss(arr,0,len-1));
    }
}
