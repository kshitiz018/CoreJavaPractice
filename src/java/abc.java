package src.java;

public class abc {
    public static void main(String[] args) {

        class1 class1 = new class1();
        class2 class2 = new class2();

        Thread1 thread1 = new Thread1(class1);
        Thread2 thread2 = new Thread2(class2);

        thread1.start();
        thread2.start();
    }
}

class class1{
     void printDocuments(int noOfCopies, String docName){
        for (int i=0;i<noOfCopies;i++){
            System.out.println("Printing class 1 "+docName+" "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }
    }

}
class class2{
     void printDocuments(int noOfCopies, String docName){
        for (int i=0;i<noOfCopies;i++){
            System.out.println("Printing class 2 "+docName+" "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }
    }

}

class Thread1 extends Thread{
    class1 pRef;
    Thread1(class1 p){
        pRef = p;
    }
    public void run(){
        pRef.printDocuments(10,"xyz.pdf");
    }
}
class Thread2 extends Thread{
    class2 pRef;
    Thread2(class2 p){
        pRef = p;
    }
    public void run(){
        pRef.printDocuments(10,"xyz.pdf");
    }
}