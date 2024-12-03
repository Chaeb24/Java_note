package practice;

public class Employee extends Person1 {
    String id;
    public Employee(){super();}
    public Employee(String name){super(name);}
    public Employee(String name,String id){
        super(name);
        this.id=id;
    }
    @Override
    public String toString()
    {return "Employee [id="+id+" name="+name+"]";}
}
