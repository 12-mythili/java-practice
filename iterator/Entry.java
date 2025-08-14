package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Entry {
   Integer id;
   String name;

   public Entry(Integer id, String name){
    this.name=name;
    this.id=id;
   }

   public static void main(String[] args) {
    HashMap<Integer,String> s = new HashMap<>();
    s.put(1, "kayal");
    s.put(2, "Abi");
    s.put(3, "Ananthi");
    s.put(4, "kavi");
    
    Iterator<Map.Entry<Integer,String>>it=s.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry entry =it.next();
        System.out.println(entry.getKey()+":"+entry.getValue());
    }

   }
}
