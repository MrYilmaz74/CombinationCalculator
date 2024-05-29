import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        // n!=1 * 2 * 3 * 4 * 5 * ... * n
        // Combinations Formula: C(n,r) = n! / (r! * (n-r)!)

        int number, n, r, counter, ncounter = 1, rcounter = 1, nrcounter = 1, nr;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items in set");
        n = scan.nextInt();
        System.out.println("Enter number of items selected from the set");
        r = scan.nextInt();

        nr = (n - r);


        for (int i = 1, j = 1, k = 1; i <= n || j <= r || k <= nr; i++, j++, k++) {

            ncounter *= i;
            System.out.println("n!=" + ncounter);
            if (i >= n) continue;

            if (r >= nr) {
                if (j >= r + 1) continue;
                rcounter *= j;
                System.out.println("r!=" + rcounter);


                if (k >= nr + 1) continue;
                nrcounter *= k;
                System.out.println("n-r)!=" + nrcounter);
            } else {

                if (k >= nr + 1) continue;
                nrcounter *= k;
                System.out.println("n-r)!=" + nrcounter);

                if (j >= r + 1) continue;
                rcounter *= j;
                System.out.println("r!=" + rcounter);


            }


        }
        c = (double) ncounter / (rcounter * nrcounter);
        System.out.println(n + "!= " + ncounter);
        System.out.println(r + "!= " + rcounter);
        System.out.println(nr + "!= " + nrcounter);
        System.out.println("C(" + n + "," + r + ")=" + c);


    }
}
