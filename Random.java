public class Random {
    public static void main(String[] args)
    {
        String[] names={"Mythili","Harish","Madhu","Deva","Karan"};
        int number = (int)(Math.random() * 5) ;
        System.out.println(names[number]);
    }
}
