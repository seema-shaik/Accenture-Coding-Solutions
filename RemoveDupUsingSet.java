import java.util.*;
public class RemoveDupUsingSet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        int n = st.length;
        HashSet<Integer> al = new HashSet<>();
        for(String i: st)
        {
            al.add(Integer.parseInt(i));
        }
        for(Integer it : al)
        {
            System.out.print(it+" ");
        }
    }
}
