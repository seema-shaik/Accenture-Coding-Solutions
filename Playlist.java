import java.util.*;
public class Playlist 
{
    static int playlist(String st,int k)
    {
        int max_cnt = 0,curr = 0;
        for(int i  = 0;i < k && i < st.length();i++)
        {
            if(st.charAt(i) == 'a')
            {
                curr++;
            }
        }
        max_cnt = curr;
        for(int i = k;i < st.length();i++)
        {
            if(st.charAt(i-k) == 'a')
                curr--;
            if(st.charAt(i) == 'a')
                curr++;
            max_cnt = Math.max(max_cnt, curr);
        }
        return max_cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(playlist(st,k));
    }
}
