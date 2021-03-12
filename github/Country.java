/* arraylist operation */

import java.util.ArrayList;
public class Country
{
    public static void main(String[] args)
    {
      ArrayList<String> list = new ArrayList<>();
      list.add("india");
      list.add("uk");
      list.add("usa");
      list.add("chaina");
      list.add("japan");

      list.add( 0, "rashya" ); // insert rashya in 0th index
     
      list.contains("india");  // india present in above list or not
     
      list.remove(  2  );      // remove 2nd index element
     
      // list.clear();  clear the above list element
     
         for( String s: list )
         {
            System.out.println(s);
         }
     }
}
