import java.util.*;
class Max
{
   public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   int[] arr = new int[5];
   int i,max=arr[0],min=arr[0];
   for(i=0;i<arr.length;i++)
   {
      System.out.printf("Enter the value of array[%d]\n",i);
      arr[i]=nextInt();
      if(arr[0]<min)
      {
         min=arr[i];
      }
      if(arr[0]>max)
      {
          max=arr[i];
      }
     System.out.println("maximum = %d,minimum =%d",max,min); 
}
}      
} 