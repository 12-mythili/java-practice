package iterator;

import java.util.HashMap;
import java.util.Iterator;

class Value {
    Integer id;
    String name;

    public Value(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        HashMap<Integer,String> n= new HashMap<>();
        n.put(1, "Mythili");
        n.put(2, "Dhivya");
        n.put(3, "Kavya");
        n.put(4, "Rithisha");

        Iterator<String> it=n.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
