package week2.session1.stringvsbuildervsbuffer;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int n = 100000;
        long startTime, endTime;

        // String ile test
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String işlemi süresi: " + (endTime - startTime) + " ms");

        // StringBuilder ile test
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder işlemi süresi: " + (endTime - startTime) + " ms");

        // StringBuffer ile test
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer işlemi süresi: " + (endTime - startTime) + " ms");
    }
}
