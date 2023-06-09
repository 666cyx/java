package guess;

import java.util.Random;

public class Compute {
    public int score;
    public String name;

    public int chuquan(){
        Random n = new Random();
        int i = n.nextInt(3)+1;
        System.out.println("电脑出拳："+i);
        return i;
    }
}
