import java.util.*;
public class MaxRepeatedChar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int []chcnt = new int[256];
        for(char ch: st.toCharArray())
        {
            chcnt[ch]++;
        }
        int maxcnt = 0;
        char maxchar = ' ';
        int isflag = 0;
        for(int i  = 0;i < 256;i++)
        {
            if(chcnt[i] > maxcnt)
            {
                maxcnt = chcnt[i];
                maxchar = (char)i;
                isflag = 0;
            }
            else if(chcnt[i] == maxcnt && maxcnt > 1)
            {
                isflag = 1;
            }
        }
        if (isflag == 1|| maxcnt <= 1) {
            System.out.println("0");
        } else {
            System.out.println(maxchar);
        }
    }
}
