package thread.first;

public class Main {
    public static void main(String[] args){
        System.out.println("Main thread is starting");

        MyThread myThread = new MyThread("child1");
        MyThread myThread2 = new MyThread("child2");
        MyThread myThread3 = new MyThread("child3");

        myThread.start();
        myThread2.start();
        myThread3.start();

        do{
            System.out.println("__Main Dongu__");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Main thread is interrupted");
            }
        }while(myThread.isAlive() || myThread2.isAlive() || myThread3.isAlive());
        System.out.println("Main thread is terminating");
    }
}
