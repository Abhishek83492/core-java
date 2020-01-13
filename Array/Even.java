import java.util.*;
class Even
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int i,even=0,odd=0,add=0,sum=0;
    for(i=0;i<arr.length;i++)
    {
        System.out.printf("Enter the values of arr[%d]\t\n",i);
        arr[i]=sc.nextInt();
        if(arr[i]%2==0)
        {
          System.out.printf("Even no is%d\n",arr[i]);
          sum=sum+arr[i];
         even++;
         }
        else
         {
              System.out.printf("Odd no is%d\n",arr[i]);
              add=add+arr[i];
           odd++;
          }
    }
System.out.printf("Even is %d,odd is %d\n",even,odd);
 System.out.printf("Even number is %d\n",sum);
 System.out.printf("Odd number is %d\n",add); 

}
}

       
             