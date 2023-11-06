package Proj18;

public class task_5 {
        public static void getDetails(String key) {
            try {
                if (key == "null") {
                    throw new NullPointerException("null key in getDetails");
                }
            } catch (NullPointerException e) {
                System.out.println("Exception");
            }
        }

    public static void main(String[] args) {
        getDetails("null");
    }
}
