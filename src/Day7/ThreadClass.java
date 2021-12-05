package Day7;

public class ThreadClass implements Runnable {

        private String name;
        private int numer;

        public ThreadClass(String name, int numer) {
            this.name = name;
            this.numer = numer;
        }

        public ThreadClass(String name) {
        this.name = name;
        }

        public void run() {
            for (int i=1; i <= numer; i++) {
                System.out.println(name + " " + i);
                Thread.yield();
            }
        }

    public String getName() {
            return name;
    }
}
