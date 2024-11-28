package Study;

public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("js","Turkish Angora");
        Cat cat2 = new Cat("js","Turkish Angora");

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}
