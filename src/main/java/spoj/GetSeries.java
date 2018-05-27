package spoj;

import java.util.Scanner;

/**
 * Created by Mateusz on 2018-05-26.
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


    public long getHighestProfit() {
        long profit;
        for(int i = 0; i<n; i++) {
            profit = this.scan.nextInt();
            setCurrentSum(profit);
            if (getCurrent() < 0)
                setCurrent(0);
            if (getCurrent() > getHighest())
                setHighest(getCurrent());
        }
        return getHighest();

    }


    private long getHighest() {
        return highest;
    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    private long getCurrent() {
        return current;
    }

    private void setCurrentSum(long a){
        this.current+=a;
    }

    private void setCurrent(long current) {
        this.current = current;
    }

    private void setHighest(long highest) {
        this.highest = highest;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
