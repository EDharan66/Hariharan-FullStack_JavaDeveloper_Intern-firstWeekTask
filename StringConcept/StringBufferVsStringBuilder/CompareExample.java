public class CompareExample {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("Hai hello");

        for (int i = 0; i < 10000; i++) {
            sb.append("!!!!");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();

        StringBuilder sb1 = new StringBuilder("Hai hello");

        for (int i = 0; i < 10000; i++) {
            sb1.append("!!!!");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}