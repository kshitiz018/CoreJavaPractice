package src.java;

public class NewThread implements Runnable {

    String name;
    Thread thread;

    public NewThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.print("A new thread :"+thread+"is created\n");
        thread.start();
    }

    @Override
    public void run() {
        for (int i=5;i>0;i--){
            System.out.println(name+": "+i);

        }
        System.out.println(name+" thread exiting.");
    }
}

class ThreadExample2 {
    public static void main(String[] args) {
        new NewThread("1st");
        new NewThread("2nd");
        new NewThread("3rd");


        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Inturruption occurs in Main Thread");
        }

        System.out.println("We are exiting from main Thread");


    }
}
