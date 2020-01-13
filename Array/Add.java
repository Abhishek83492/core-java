import java.util.*;
class Add1
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  int[] a = new int[5];
  int i,sum=0;
  for(i=0;i<a.length;i++)
  {
       System.out.printf("Enter the value of elements a[%d]\n",i);
       a[i]=sc.nextInt();
       sum=sum+a[i];
  }
   System.out.printf("Sum = %d\n",sum);
 } 
}
           