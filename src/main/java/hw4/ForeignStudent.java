package hw4;

public class ForeignStudent extends Student{
    String nation;

    public ForeignStudent(String name,int grade,String nation){
        super(name,grade);
        this.nation = nation;
    }

    public String getNation(){return nation;}
    public void setNation(String nation){this.nation=nation;}

    @Override
    public void print(){
        super.print();
        System.out.print("국적:"+nation);
    }
}
