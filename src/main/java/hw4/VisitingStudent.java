package hw4;

public class VisitingStudent extends Student{
    String school;

    public VisitingStudent(String name,int grade,String school){
        super(name,grade);
        this.school=school;
    }

    public String getSchool(){return school;}
    public void setSchool(String school){this.school=school;}

    @Override
    public int totalfee(){
        super.totalfee();
        return 100000*super.getGrade();
    }

    @Override
    public void print(){
        super.print();
        System.out.print("소속학교:"+school);
    }
}
