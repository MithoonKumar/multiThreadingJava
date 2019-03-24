public class Main {
    public static void main(String[] args) {
        UtilityClass utilityClass = new UtilityClass();
        Thread1 thread1 = new Thread1(utilityClass);
        Thread2 thread2 = new Thread2(utilityClass);
        thread1.start();
        thread2.start();
    }
}
