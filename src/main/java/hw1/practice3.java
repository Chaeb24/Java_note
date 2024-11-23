package hw1;

import java.util.ArrayList;
import java.util.Iterator;

public class practice3 {
    public static void main(String[] args) {
       ArrayList<Integer>nums = new ArrayList<Integer>();

       for(int i=1;i<=100;i++) {
           if (i % 4 == 0 && i % 5 != 0) {
               nums.add(i);
           }
       }

        int sum=0;
        Iterator <Integer>iter = nums.iterator();
       while(iter.hasNext()){
          sum+=iter.next();
       }
           System.out.println(sum);
    }
}
