package Day7;

public class ThreadClassChild extends ThreadClass {

    public ThreadClassChild(String name) {
        super(name);
    }

    @Override
        public void run(){
            for (int i = 0; i <4; i++){
                System.out.println("Thread : " + this.getName());
                try{
                    Thread.sleep(0);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

