public class CatRunner {
    public static void main (String[] args)
    {
        Cat cat1 = new Cat("Hazel", 2, 9.6);
        cat1.introduce();
        cat1.printCatInfo();

        System.out.println();

        Cat cat2 = new Cat("Klaus", 3, 10.1);
        cat2.introduce();
        cat2.printCatInfo();
    }

}
