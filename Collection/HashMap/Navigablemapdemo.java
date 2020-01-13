import java.util.*;
class Navigablemapdemo
{
    public static void main(String[] args)
    {
          TreeMap<String,Integer> h = new TreeMap<String,Integer>();
          h.put("Abhishek",100);
          h.put("Deepak",101);
          h.put("Arpan",108);
          h.put("Avinash",null);
          h.put("Aakash",106);
          h.put("Gang",500);
          h.put("harsg",654);
          h.put("haen",null);
          System.out.println(h);
          
          System.out.println(h.ceilingKey("Gang"));
          System.out.println(h.higherKey("Gang"));
          System.out.println(h.floorKey("Avinash"));
          System.out.println(h.lowerKey("Avinash"));
          System.out.println(h.pollFirstEntry());
          System.out.println(h.pollLastEntry());
          System.out.println(h.descendingMap());
         }
}