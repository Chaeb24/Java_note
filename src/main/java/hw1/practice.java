package hw1;

public class practice {
    public static void main(String[] args) {
        int []temp = {13,6,5,18,17,17};
        String [] names = {"도쿄","베이징","런던","시드니","존F케네디","조모케냐타"};

        for (int i = 0;i<names.length;i++)
            System.out.printf("공항: %s\t온도: %d\n",names[i],temp[i]);
    }

}
