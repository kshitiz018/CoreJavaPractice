package src.java;

public class JavaThread {
    public static void main(String[] args) {

        System.out.println("Application Started");

        Runnable task = new myTask();
        Thread thread = new Thread(task);
        thread.start(); // Now myTask and main is executed parallely or concurrently

        Thread yourTask = new Thread(new yourTask());
        yourTask.start();
       // yourTask.setDaemon(true);

        for(int i=0;i<10;i++){
            System.out.println("Main"+ i);
        }
    }
}

//class myTask extends Thread{
//
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("MyTask"+i);
//        }
//    }
//}

class CA {

}
class myTask extends CA implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("MyTask"+i);
        }
    }
}

class yourTask implements Runnable{


    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Your Task "+i);
        }
    }
}
