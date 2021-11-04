import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void person() {
        Person firstPerson = new Person("Adam", 20);
        Person secPerson = new Person("Eve", 19);

        System.out.println(firstPerson);
        System.out.println(secPerson);
    }

    @Test
    void add() {
        int B = 5;
        int A = 2;


        int sum = A + B;

        Add firstAdd = new Add(A, B);

        System.out.println(firstAdd + "=" + sum);
    }
    @Test
    void hollowRec() {

int n = 8;
int m = 8;

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
    }

    @Test
    void paint() throws InterruptedException {
        System.out.println("\n");
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
            }

            System.out.println();
            Thread.sleep(300);
        }
    }

    @Test
    void writeToArray() {
    }
}