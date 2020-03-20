public class If {

    public static void main(String[] args) {
        ilja();
        if(5==5||5<3){    //5==5&&5<3 // 5==5&&5>4
            System.out.println("yes");
        }else {
            System.out.println("No false");
        }
    }
    public static void ilja(){
        int number = 20;
        if(number < 10){
            System.out.println("ok");
        }else if (number >20){
            System.out.println("ok very good");

        }else if(number == 20){
            System.out.println("no numbers in diapazon");
        }

    }
}

