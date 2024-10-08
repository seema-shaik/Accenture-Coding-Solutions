import java.util.*;
public class FreqArrayUsingHashMap 
{
    static void cntfreq(int arr[],int n)
    {
        Map<Integer,Integer>mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }
        for (int i = 0; i < n; i++) 
        {
            if (mp.get(arr[i]) != -1) 
            {
                System.out.println(arr[i] + " " + mp.get(arr[i]));
                mp.put(arr[i], -1);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String num[] = st.split(" ");
        int len = num.length;
        int arr[] = new int[len];
        for(int i = 0;i < len;i++)
        {
            arr[i] = Integer.parseInt(num[i]);
        }
        cntfreq(arr,len);
    }
}
