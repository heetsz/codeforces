import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        while (t-- > 0) {
            char arr[][] = new char[10][10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = line.charAt(j); 
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    char ch = arr[i][j];
                    if (ch == 'X') {
                        if (i == 0 || i == 9 || j == 0 || j == 9) {
                            sum += 1;
                        } else if (i == 1 || i == 8 || j == 1 || j == 8) {
                            sum += 2;
                        } else if (i == 2 || i == 7 || j == 2 || j == 7) {
                            sum += 3;
                        } else if (i == 3 || i == 6 || j == 3 || j == 6) {
                            sum += 4;
                        } else {
                            sum += 5;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
