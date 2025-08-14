package iterator;

import java.util.HashMap;
import java.util.Iterator;

class Key {
    Integer id;
    String name;

    public Key(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1, "Mythili");
        m.put(2, "Dhivya");
        m.put(3, "kavya");
        m.put(4, "Rithisha");

        Iterator<Integer> it=m.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
