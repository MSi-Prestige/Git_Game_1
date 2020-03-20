import java.util.ArrayList;

public class Array {


    public static void main(String[] args) {
        int number = 10;                 // primitiv dann , korobka
        //  char character = 'a';                   //primitiv dan
        int[] numbers = new int[5];            //ssilka na massiv
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++){
            System.out.println("1,2,3");
        }
    }
    }

