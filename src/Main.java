public class Main {
    public static void main(String[] args){
        System.out.print("hello word");

        byte myNum = 100;
        System.out.println(myNum);

        short myNu = 5000;
        System.out.println(myNu);

        float my = 5.75f;
        System.out.println(my);

        double mynum = 19.99d;
        System.out.println(mynum);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

// Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);    // Outputs 9
    }
}
