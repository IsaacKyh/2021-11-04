import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Game {
    // creating the scanner to all scanners
    static Scanner sc = new Scanner(System.in);
    BufferedWriter writer;

// creating 2 persons from the class Person
    public void Person() {
        Person firstPerson = new Person("Adam", 20);
        Person secPerson = new Person("Eve", 19);

        System.out.println(firstPerson);
        System.out.println(secPerson);
    }


    public void Add() {
        //creates a txt file and write-downs the answer and shows the last answer
        System.out.println("\n\nthe last number was: ");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//
//        System.out.println("What 2 numbers do you wanna add? ");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the 1 number: ");
//        int A = in.nextInt();
//        System.out.println("Enter the 2 number: ");
//        int B = in.nextInt();
//        in.close();


        // adding 2 numbers the user types in
        int B;
        int A = getB(sc);

        B = getB(sc);

        int sum = A + B;

        Add firstAdd = new Add(A, B
//               , sum
        );

        System.out.println(firstAdd + "=" + sum);

        // takes the sum that stod in the txt file write it out
        int[] sums = {sum};
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));


            for (int summor : sums) {
                writer.write("\n" + summor);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // checks so both numbers are numbers and nothing else.
    private int getB(Scanner sc) {
        int B;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            B = sc.nextInt();

        } while (B <= 0);
        System.out.println("ty for the: " + B);
        return B;
    }

//writes a hollow rectangle
    public void HollowRec() {
        // user input
        System.out.println("How do you want the rec to look like? ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows: ");
        int n = sc.nextInt();
        System.out.println("Enter how many columns: ");
        int m = sc.nextInt();

//int n = 2;
//int m = 3;


//        HollowRec firstRec = new HollowRec(n, m);
        Add firstRec = new Add (n,m);

        System.out.println(firstRec);

        int i, j;

            for (i = 1; i <= n; i++)
            {
                for (j = 1; j <= m; j++)
                {
                    if (i == 1 || i == n ||
                            j == 1 || j == m)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }


//    public static void testRec(int n, int m){
//        {
//            int i, j;
//
//            for (i = 1; i <= n; i++)
//            {
//                for (j = 1; j <= m; j++)
//                {
//                    if (i == 1 || i == n ||
//                            j == 1 || j == m)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//                System.out.println();
//            }
//
//
//
//        }
//    }



    }
    // just writes out a filled rectangle and prints evey line with 300milliseconds
    public static void Paint() throws InterruptedException {
        System.out.println("\n");
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
            }

            System.out.println();
            Thread.sleep(300);
        }
    }

    // asks for how many numbers in the array the user want to write and then
    // the user have to write so many numbers and then
    // the numbers come out with the biggest number first and the smallest last
    public static void WriteToArray() {
        int n;
//        int t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=sc.nextInt();
//creates an array in the memory of what the user types
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {

            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");

        Arrays.sort(arr, Collections.reverseOrder());
        sc.close();
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        }


}

