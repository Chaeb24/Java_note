package hw1;

public class practice2 {
    public static void main(String[] args) {
        String sentence = "hello"; //0 1 2 3 4

        StringBuilder str = new StringBuilder();
        for(int i=sentence.length()-1;i>=0;i--) //문자열 4부터 시작
            str.append(sentence.charAt(i));

        System.out.println(str);

        char[] charArray = sentence.toCharArray();
        //문자열을 char형으로 변환하는 공식

        StringBuilder reversed = new StringBuilder();

        for(int i=charArray.length-1;i>=0;i--) //문자열 4부터 시작
            reversed.append(charArray[i]);

        System.out.println(reversed);

    }
}
