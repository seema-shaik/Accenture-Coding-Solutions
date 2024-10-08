import java.util.*;
public class FreqArr 
{
    static void cntfreq(int num[],int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited,false);
        for(int i = 0; i < n;i++)
        {
            if(visited[i] == true)
                continue;
            int cnt = 1;
            for(int j = i+1;j < n;j++)
            {
                if(num[i] == num[j])
                {
                    visited[j] = true;
                    cnt++;
                }
            }
            System.out.println(num[i]+" "+cnt);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String arr[] = st.split(" ");
        int n = arr.length;
        int num[] = new int[n];
        for(int i = 0; i < n;i++)
        {
            num[i] = Integer.parseInt(arr[i]);
        }
        cntfreq(num,n);
    }
}
