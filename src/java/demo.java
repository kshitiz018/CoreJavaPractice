package src.java;

public class demo {
    public static void main(String[] args) {

        String s = "abc";
        String s2 ="abc";
        s.concat("abc1");
        System.out.println(s2);
        System.out.println(s);

        final StringBuffer s1 = new StringBuffer("wdfwee");
        s1.append("wqdefrgh00");
        System.out.println(s1);

        String NewString = "Hello";
        NewString.concat("World");
        System.out.println(NewString);
        NewString = NewString.concat("World");
        System.out.println(NewString);

        char[] charArray = {'h','e','l','l','o'};
        String s3 = new String(charArray);
        System.out.println(charArray); //print hello because string is a sequence of characters;
        System.out.println(s3);

        //Threads
        for(double i=0;i<999999999;i++);

        System.out.println("done");
    }
}
