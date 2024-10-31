/*      Enter number of rows: 5
    1
   232
  34543
 4567654
567898765    */

import java.util.Scanner;
public class NumberPattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int k = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(k);
                if (j < i) {
                    k++;
                } else {
                    k--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
