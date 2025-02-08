import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        // sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                if(min > Math.abs(curr)){
                    min = Math.abs(curr);
                }
            }
            System.out.println(min);
        }
        //while ends here
    }
}
