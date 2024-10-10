import java.util.*;
public class StringPermute 
{
    static int permute(int n)
    {
        int res = 1;
        for(int i = 2;i <= n;i++)
        {
            res = res*i;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int vowcnt = 0;
        for(char ch: st.toCharArray())
        {
            if(ch == 'A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U' || ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowcnt++;
            }
        }
        int conscnt = st.length()-vowcnt;
        System.out.println(permute(conscnt));
    }
}
