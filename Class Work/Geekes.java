import java.util.*;
public class Geekes {
    public static void main(String[] args) {
      LinkedList<String> l = new LinkedList<String>();
      l.add("First");
      l.add("Second");
      l.add("Third");
      l.add("Fourth");
      l.add("Fifth");

    System.out.println(l.peek());

      l.remove(1);      
      System.out.println(l.peek());
      l.remove("Second");
      System.out.println(l.contains("First"));
 
      System.out.println("print by loop");
      for(String s:l){
        System.out.println(s);
      }
    }
}

