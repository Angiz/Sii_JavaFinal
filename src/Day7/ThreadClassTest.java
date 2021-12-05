package Day7;

public class ThreadClassTest {

        public static void main(String[] args) {
            for(int k=1; k<10; k++) {
                ThreadClassChild threadClassCh = new ThreadClassChild("Thread "+k);
                threadClassCh.run();
            }

            for(int j=1; j<10; j++) {
                ThreadClass w = new ThreadClass("Thread implementing Runnable" , j);
                w.run();
            }
        }

    }


