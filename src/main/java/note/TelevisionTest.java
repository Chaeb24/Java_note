package note;

public class TelevisionTest {
    public static void main(String[] args) {
        System.out.println("현재 생성된 텔레비전 수: " + Television.getNumberOfTVs());
        Television tv1 = new Television();
        Television tv2 = new Television("samsung");
        Television tv3 = new Television("LG",200000);

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());

        System.out.println("현재 생성된 텔레비전 수: " + Television.getNumberOfTVs());
    }
}
