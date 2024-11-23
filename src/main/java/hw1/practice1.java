package hw1;

import java.util.Random;

public class practice1 {
    public static void main(String[] args) {
    String []subjects = {"I","You","A friend of mine"};
    String []verb = {"play","love","eat"};
    String []etc = {"a football","to cook"};

    Random random = new Random();
    String subject = subjects[random.nextInt(subjects.length)];
    String verbs = verb[random.nextInt(verb.length)];
    String etcs = etc[random.nextInt(etc.length)];

    StringBuilder sentence = new StringBuilder();
    sentence.append(subject);
    sentence.append(" ");
    sentence.append(verbs);
    sentence.append(" ");
    sentence.append(etcs);

        System.out.println(sentence.toString());

    }
}
