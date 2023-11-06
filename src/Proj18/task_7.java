package Proj18;
import java.util.Scanner;
public class task_7 {

        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.err.println("Exception caught in getKey(): " + e.getMessage());
            }
        }

        public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
        }

        private String getDetails(String key) throws Exception {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }

        public static void main(String[] args) {
            task_7 demo = new task_7();
            demo.getKey();
        }

}
