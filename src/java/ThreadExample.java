package src.java;

public class ThreadExample extends Thread {

    public void run() {
        int a =10;
        int b = 20;
        int result = a+b;
        System.out.println("Thread is running");
        System.out.println("Sum of two numbers is : "+ result);
    }

    public static void main(String[] args) {
        // Creating instance of the class extend Thread class
        ThreadExample t1 = new  ThreadExample();
        //calling start method to execute the run() method of the Thread class
        t1.start();
    }

}
