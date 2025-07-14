package abstractionprgm;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b= new Cat();
        a.setSound();
        a.getSound();
        b.setSound();
        b.getSound();

    }
    
}
