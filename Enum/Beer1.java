enum Beer1
{
       kf,ks,ss,dtr
}
class Test1
{
    public static void main(String[] args)
    {
          Beer1 b = Beer1.dtr;
          System.out.println(b);
          switch(b)
          {
                  case kf:
                         System.out.println("its a child");
                          break;
                  case ks:
                         System.out.println("its a child4");
                          break;
                  case ss:
                         System.out.println("its a child3");
                          break;
                  case dtr:
                         System.out.println("its a child2");
                          break;
                  default:
                          System.out.println("its a child1");

}
}
}