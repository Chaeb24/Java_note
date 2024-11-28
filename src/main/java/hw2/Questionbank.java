package hw2;

import java.util.Random;
import java.util.HashSet;

//***************************

// 파일명: Questionbank .java

// 작성자: 박채빈

// 작성일: 2024.11.28

// 내용: Hashset를 이용하여 배열에 있는 질문 5개가 랜덤으로 출력되도록 함.

//***************************

public class Questionbank {
    public static void main(String[] args) {
        String[] questionBank = {
                "파란색이 영어로 무엇인가?", "빨간색이 영어로 무엇인가?",
                "사과는 영어로 무엇인가?", "한국의 수도는?",
                "일본의 수도는?", "1+2는?",
                "9-3은?", "99-33은?",
                "3*2는?", "12/3은?"};

        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        int count = 5;
        int questionnum=1;

        System.out.println("hw13_1: 박채빈");

        while(set.size()<count){
            int index = random.nextInt(questionBank.length);
            if(!set.contains(index)){
                set.add(index);
                System.out.println(questionnum+")"+ questionBank[index]);
                questionnum++;
            }
        }
    }
}