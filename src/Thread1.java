public class Thread1 extends Thread {

    private final UtilityClass utilityClass;

    public Thread1(UtilityClass utilityClass) {
        this.utilityClass = utilityClass;
    }

    @Override
    public void run() {
        this.utilityClass.printUsingLoop(this.getClass().getName(), 10);
    }
}
