package hw4;

public class Student {
    private String name;
    private int grade;

    public Student(String name,int grade){
        this.name = name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int totalfee(){
        if(grade>6)
            return 3000000;
        else return 200000*grade;
    }

    public void print(){
        System.out.println("이름:"+name+"학점:"+grade);
    }
}
