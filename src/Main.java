public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i= 100; i < 1000; i++ ){
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf(i + " ");
                i++;
            }
            if (count % 10 == 0 && count != 0) {
                System.out.printf("\n");
                    count ++;
                }
            }
        }
    }