package practice;

class Person1{
    String name;
    public Person1() { }
    public Person1(String theName){this.name = theName;}
}

public class EmployeeTest{
    public static void main(String[] args) {
        Employee e = new Employee("Kim","20210001");
        System.out.println(e);
    }
}
