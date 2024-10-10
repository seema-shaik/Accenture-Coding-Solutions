import java.util.*;
public class AutoBioDist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         int n = s.length();
        if (s == null || s.isEmpty()) {
            System.out.println("0");
            return;
        }
        int digcnt[] = new int[10];
        for(char ch:  s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                digcnt[ch-'0']++;
            }
        }

        int flag = 1;
        for(int i = 0;i < n;i++)
        {
            int exp = Character.getNumericValue(s.charAt(i));
            if(exp != digcnt[i])
            {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
        {
        HashSet<Character> hs = new HashSet<>();
        for(char c: s.toCharArray())
        {
            hs.add(c);
        }
        System.out.println(hs.size());
        }
        else
        {
            System.out.println("0");
        }
        
    }
}
