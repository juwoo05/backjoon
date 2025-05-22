import java.util.Scanner;

public class Code11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nums;
        int count;
        int hap = 0;
        count = sc.nextInt();
        nums = sc.next();


        for (char c : nums.toCharArray()) {
              hap += c - '0';
//            if (c - '0') {
//            } else if (c == '1') {
//                hap = hap + 1;
//            } else if (c == '2') {
//                hap = hap + 2;
//            } else if (c == '3') {
//                hap = hap + 3;
//            } else if (c == '4') {
//                hap = hap + 4;
//            } else if (c == '5') {
//                hap = hap + 5;
//            } else if (c == '6') {
//                hap = hap + 6;
//            } else if (c == '7') {
//                hap = hap + 7;
//            } else if (c == '8') {
//                hap = hap + 8;
//            } else if (c == '9') {
//                hap = hap + 9;
//            }
        }

        System.out.print(hap);

    }
}
