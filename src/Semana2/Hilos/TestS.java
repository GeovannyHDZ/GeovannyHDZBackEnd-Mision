package Semana2.Hilos;

public class TestS {
    public void start(){
        for (int i=1; i<=10; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        TestS h1 = new TestS();
        h1.start();

        HilosS h2 = new HilosS();
        Thread hr2 = new Thread(h2);
        hr2.start();
    }
}

class HilosS implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
