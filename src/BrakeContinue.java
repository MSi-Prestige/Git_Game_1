public class BrakeContinue {
    public static void main(String[] args) {
        iljuxa();
        int i = 0;
        while (true) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;

        }
        System.out.println("vixod");
    }

    static void iljuxa() {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {                    //ostatok 0 to 4etnoe , ili estj ostatok pri delenie to ne4et.
                continue;
            }
            System.out.println("ne 4etnie cisla " + i);
        }
    }
}