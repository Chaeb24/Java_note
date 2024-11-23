package Study;

public class RectangleImpl2 extends Rectangle implements Ishape, Ishape2 {
    @Override
    public int getNumOfPoints() {
        return 0;
    }

    public RectangleImpl2(double width, double height){
        super(width,height);
    }
    @Override
    public double getArea(){
        return getWidth()*getHeight();
    }
    @Override
    public double getPerimeter(){
        return 2*(getWidth()+getHeight());
    }

}
