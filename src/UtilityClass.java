public class UtilityClass {
    public void printUsingLoop(String threadName, Integer n) {
        for(Integer i = 0; i<n; i++) {
            System.out.println("The name of the printer thread is " + threadName);
        }
    }
}
