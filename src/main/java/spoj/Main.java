package spoj;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-19.
 */
public class Main {
    public static void main(String[] args) {
        long n, current = 0, highest = 0;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        if (n >= 1 && n <= 100000) {

            GetSeries function = new GetSeries(scan, n);
            System.out.println(function.getHighestProfit());

        } else System.exit(-1);
    }
}

