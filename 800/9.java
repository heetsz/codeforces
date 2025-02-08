import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int sum = 0;
            for(int i=0;i<n-1;i++){
                int temp = sc.nextInt();
                sum += temp;
            }
            System.out.println(-sum);
        }//End of while loop
        sc.close();
    }
}
