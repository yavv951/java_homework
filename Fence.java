import java.util.Scanner;

public class Fence {
    //Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
    // На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора - ");
        int len_fence;
        int len_words=346;
        len_fence = sc.nextInt();
        if(len_fence > len_words){
            System.out.println("Слова помещаются на заборе");
        } else System.out.println("Слова не умещаются на заборе");
    }
}