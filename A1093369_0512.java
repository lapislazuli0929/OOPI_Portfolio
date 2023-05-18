import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class A1093369_0512 {
    private static int porkDumplingCount = 5000;
    private static int beefDumplingCount = 3000;
    private static int vegetableDumplingCount = 1000;

    public static synchronized void dumplingcost() {
        int dumplingOrderCount = (int) (Math.random() * (50 - 10 + 1)) + 10;
        int dumplingOrdertype = (int) (Math.random() * (3 - 1 + 1)) + 1;
        if (dumplingOrdertype == 1 && porkDumplingCount != 0) {
            if (porkDumplingCount >= dumplingOrderCount) {
                int tmp = porkDumplingCount;
                tmp = tmp - dumplingOrderCount;
                porkDumplingCount = tmp;
                System.out.printf("porkDumplingCount remaining: " + porkDumplingCount + "\n");
            } else {
                porkDumplingCount = 0;
                System.out.printf("porkDumplingCount sell down.\n");
            }
        } else if (dumplingOrdertype == 2 && beefDumplingCount != 0) {
            if (beefDumplingCount >= dumplingOrderCount) {
                int tmp = beefDumplingCount;
                tmp = tmp - dumplingOrderCount;
                beefDumplingCount = tmp;
                System.out.printf("beefDumplingCount remaining: " + beefDumplingCount + "\n");
            } else {
                porkDumplingCount = 0;
                System.out.printf("beefDumplingCount sell down.\n");
            }
        } else if (dumplingOrdertype == 3 && beefDumplingCount != 0) {
            if (vegetableDumplingCount >= dumplingOrderCount) {
                int tmp = vegetableDumplingCount;
                tmp = tmp - dumplingOrderCount;
                vegetableDumplingCount = tmp;
                System.out.printf("vegetableDumplingCount remaining: " + vegetableDumplingCount + "\n");
            } else {
                vegetableDumplingCount = 0;
                System.out.printf("vegetableDumplingCount sell down.\n");
            }
        }
    }

    public static int getNumCustomers() {
        System.out.print("Enter number of customers: ");
        Scanner scanner = new Scanner(System.in);
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        return numCustomers;
    }

    public static void main(String[] args) {
        int numCount = 1;
        int Cnum = getNumCustomers();
        while (numCount != 0) {
            for (int i = 0; i < Cnum; i++) {
                dumplingcost();
            }
            System.out.println("-------------------------");
            try {
                Thread.sleep((int) (3000));
            } catch (InterruptedException e) {
            }
            numCount = porkDumplingCount + beefDumplingCount + vegetableDumplingCount;
        }
        if (numCount == 0) {
            System.out.printf("水餃賣完了！");
        }
    }
}
