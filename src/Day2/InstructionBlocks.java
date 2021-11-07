package Day2;

public class InstructionBlocks {
    static long i = 17;
    public static void main(String[] args) {
        System.out.println(i);
        //byte i; can't do this
        {
            int i = 0;
            System.out.println(i);
        }
        {
            double i = 0.0;
            System.out.println(i);
        }

    }
}
