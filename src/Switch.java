import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {
        iljuxa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi vozrast");
        int age = scanner.nextInt();
        if(age == 10) {
            System.out.println("you small");
        }else if(age == 20) {
            System.out.println("you good");
        }else if(age == 30){
            System.out.println("you big");
        }
    }

    static void iljuxa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi vozrast");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("ti rodilsa");
                break;
            case 7:
                System.out.println("tebe v skolu");
                break;
            case 16:
                System.out.println("tebe v u4agu");
                break;
            default:
                System.out.println("ti krutoj");
        }



    }


}
