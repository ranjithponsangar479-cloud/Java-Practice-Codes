import java.util.*;

public class binarySearch
{
    public static void main(String z[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the sorted elements:");
        for(int i=0; i<size; i++)
            a[i] = sc.nextInt();        
        int target = sc.nextInt();
        int left = 0;
        int right = size - 1;
        int foundIndex = -1;
        
        while(left <= right)
        {
            int middle = left + (right - left) / 2;
            if(a[middle] == target)
            {
                foundIndex = middle;
                    break;
            }
            else if(a[middle] < target)
                left = middle + 1;
            else
                right = middle - 1;
        }
        if(foundIndex == -1)
            System.out.println("Number not found.");
        else
            System.out.println("Number found at index " + foundIndex + ".");
        sc.close();
    }
}