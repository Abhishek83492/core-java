class Variable
{
             void  varry(int a, int... var)
              {
             int s=0;
             for(int b : var)
               {
                  s=s+b;
               }
               System.out.println("The values are existed"+s);
               }
}
