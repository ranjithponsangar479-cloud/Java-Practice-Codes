import java.util.*;
    public class A
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int reverse=0;
            int n=a;
            while(n!=0)
            {
                    int digit=n%10;
	                reverse=reverse*10+digit;
                    n=n/10;
            }
            
             if (n==reverse)
                System.out.println("palindrome");
            else 
                System.out.println("not a palindrome");
        }
    }