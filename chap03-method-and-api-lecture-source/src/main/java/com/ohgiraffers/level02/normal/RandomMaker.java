package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public String rockPaperScissors(String first, String second, String third) {
        return (first == first) ? first : (second == second) ? second : third; // 고쳐야 됨
    }

    public String tossCoin () {
        Random random = new Random();
        int result = random.nextInt(2);
        System.out.println("result = " + result);

        return (result == 0) ? "앞면" : "뒷면";

    }


}
