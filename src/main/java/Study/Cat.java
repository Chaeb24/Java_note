package Study;
import java.time.LocalDateTime;

public class Cat {
    private String name;
    private String breed;
    private LocalDateTime birthDay;

    public Cat(String name,String breed){
        this.name = name;
        this.breed = breed;
        birthDay = LocalDateTime.now();
    }

    @Override
    public String toString(){
        return name + ":" + breed + ":"+birthDay.toString();
    }
}
