package spoj;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-19.
 */
public class Main {
    public static void main(String[] args) {
        long n, current = 0, highest = 0;       //n = number of cities

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n >= 1 && n <= 100000) {
            GetSeries function = new GetSeries(scan, n);
            //getHighest(long n, long current, long highest, Scanner scan)

            System.out.println(function.getHighest());


        } else System.exit(-1);
    }
}

