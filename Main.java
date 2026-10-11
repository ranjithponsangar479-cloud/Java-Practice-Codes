import java.util.*;

public class Main {
    public static void main(String z[]) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      if(a < b && a > c || a > b && a < c)
        System.out.println("a is second largest");
      else if(b < a && b > c || b > a && b < c)
        System.out.println("b is second largest");
      else
        System.out.println("c is second largest");
    }
}