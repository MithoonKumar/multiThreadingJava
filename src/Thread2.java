public class Thread2 extends Thread {
    private final UtilityClass utilityClass;

    public Thread2(UtilityClass utilityClass) {
        this.utilityClass = utilityClass;
    }

    @Override
    public void run() {
        this.utilityClass.printUsingLoop(this.getClass().getName(), 10);
    }
}
