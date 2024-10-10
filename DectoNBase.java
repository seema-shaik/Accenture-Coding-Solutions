import java.util.*;
public class DectoNBase 
{
    static void DectoBase(int n,int num)
    {
        String res ="";
        ArrayList<Integer> rem = new ArrayList<>();
        while(num != 0 )
        {
            rem.add(num%n);
            num = num/n;
        }
        for(int i = 0;i < rem.size();i++)
        {
            if(rem.get(i) > 9)
            {
                res = (char)(rem.get(i)-9+64)+res;
            }
            else
            {
                res = rem.get(i)+res;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        DectoBase(n,num);
    }
}
