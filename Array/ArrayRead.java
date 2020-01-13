import java.util.*;
class ArrayRead
{
     public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
       int i,j;
       for(i=0;i<arr.length;i++)
       {
             System.out.printf("Enter the value of arr[%d]\n",i);
             arr[i]=sc.nextInt();
        }
             System.out.println("The array elements are :");
             for(i=0;i<arr.length;i++)
             {
                    System.out.printf("%d\t",arr[i]);
             }
}
}   
           