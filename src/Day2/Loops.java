package Day2;

public class Loops {

    public static void main(String[] args) {

        Loops loops = new Loops();
        //loops.forEx();
        //loops.whileEx();
        loops.breakContinueExercise();
    }
    public void breakContinueExercise() {
        int k = 0;
        int j = 0;
        int counter = 0;

        e1: while (++k <=4) {
            j=0;
            e2:while(++j<=3) {
                counter++;
                if (j + k >= 5) continue;
            }
        }
        System.out.println(counter); // break; // continue; // break et1; // continue et1; // break et2; // continue et2;
    }

    public void forEx() {
        et1:
        for (int i = 0; i<10; i++) {
            et2:
            for (int j=0; j<5; j++) {
                System.out.println("i: "+i+"* j: "+j+"="+i*j);
                if (i*j > 40) continue et2;
            }
        }
    }

    public void whileEx() {
        int k = 0;
        int j= 10;

        e1: while (++k <= 10) {
            e2: while (j-->0) {
                System.out.println(j+k);
                if (j+k>12) continue e1;
            }
        }
    }

    }

