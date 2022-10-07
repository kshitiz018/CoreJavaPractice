package src.java;

class Printer{
    synchronized void printDocuments(int noOfCopies, String docName){
        for (int i=0;i<noOfCopies;i++){
            System.out.println("Printing "+docName+" "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }
    }
}

class MyThread extends Thread{
    Printer pRef;
    MyThread(Printer p){
        pRef = p;
    }
    public void run(){
        pRef.printDocuments(10,"xyz.pdf");
    }

}

class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p){
        pRef = p;
    }
    public void run(){
        pRef.printDocuments(10,"pqr.pdf");
    }

}


public class MultiThreading {
    //main is representing the main thread
    public static void main(String[] args) throws InterruptedException {
        System.out.println("==Application is Started==");

        //We have only one printer object
        Printer printer = new Printer();
     //   printer.printDocuments(10, "abc.pdf");

        MyThread myThread = new MyThread(printer);//my Thread having reference to the printer object

        YourThread yourThread = new YourThread(printer);//my Thread having reference to the printer object

        myThread.start();
      //  myThread.join(); its difficult or completed to put join() after every method call, so we use synchronised method
        yourThread.start(); // multiple objects works on the same printer object
        //printer is now shearing between the two objects.
        System.out.println("==Application Finished==");

    }
}
