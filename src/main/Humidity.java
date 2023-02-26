package src.main;
import java.util.Random;
import java.util.Scanner;

public class Humidity {
    public int humidity(){
        Random r = new Random();
        return r.nextInt(1, 100);
    }
}
