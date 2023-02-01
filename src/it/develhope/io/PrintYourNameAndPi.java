package it.develhope.io;

public class PrintYourNameAndPi {
    public static void main(String[] args) {
        String name = "Lucrezia";
        double Pi = 3.141590;

        String fName = String.format("%S",name);
        String fLine = String.format("%n");
        String fPi = String.format("The number Pi is %f",Pi);

        System.out.printf(fName + fLine + fPi);
    }
    
}
