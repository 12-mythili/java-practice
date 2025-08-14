import java.util.ArrayList;
import java.util.Iterator;

class Name{
    String name;

    public Name(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ArrayList<Name> n=new ArrayList<Name>();
        n.add(new Name("Mythili"));
        n.add(new Name("Dhivya"));
        n.add(new Name("Kavya"));
        n.add(new Name("Rithisha"));

        Iterator<Name> it=n.iterator();
        while (it.hasNext()) {
            Name obj=it.next();
            System.out.println(obj.getName());
        }
    }

}