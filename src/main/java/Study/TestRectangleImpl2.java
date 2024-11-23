package Study;

public class TestRectangleImpl2 {
    public static void main(String[] args) {
        RectangleImpl2 r = new RectangleImpl2(10.,20.);
        System.out.printf("area: %.2f\n",r.getArea());
        System.out.printf("perimeter: %.2f\n",r.getPerimeter());
        System.out.printf("num of points : %d", r.getNumOfPoints());
    }
}
