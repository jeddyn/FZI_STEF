package spoj;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-27.
 */
public class GetSeries {
    private long n;
    private long current;
    private long highest;
    private Scanner scan;


    GetSeries(Scanner scan, long n){
        this.n=n;
        this.highest=0;
        this.current=0;
        this.scan = scan;
    }


    public long getHighest() {
        long profit;
        for(int i = 0; i<n; i++) {
            profit = scan.nextInt();
            current += profit;
            if (current < 0)
                current = 0;
            if (current > highest)
                highest = current;
        }
        return highest;

    }
}
