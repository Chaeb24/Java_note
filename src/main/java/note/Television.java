package note;

public class Television {
    private String model;
    private int price;
    private static int numberOfTVs = 0;

    public String getModel(){return model;}
    public void setModel(String model){
        this.model = model;
    }

    public int getPrice(){return price;}
    public void setPrice(int price){
        this.price=price;
    }

    public Television(){
        this.model = "MyTV";
        this.price = 0;
        numberOfTVs++;
    }

    Television(String model){
        this(model,0);  //생성자 3번째 불러오기 때문에 numberofTVs 수를 증가시킬 필요가 없음.
    }

    Television(String model, int price){
        this.model = model;
        this.price = price;
        numberOfTVs++;
    }

    public static int getNumberOfTVs(){
        return numberOfTVs;
    }

    public String toString(){
        return "모델명:"+model+" 가격:"+price;
    }
}
