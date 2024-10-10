import java.util.*;
public class BinToDec 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        int decimal=Integer.parseInt(bin,2);  
        System.out.println(decimal);
    }
}
