public class App {
    public static void main(String[] args) throws Exception {
        Multithreading thread = new Multithreading();
        Multithreading thread2 = new Multithreading();
        thread.start();
        thread2.start();

    }
}
