import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<n;i++){
                hs.add(sc.nextInt());
            }
            if(hs.contains(k)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }//End of while loop
        sc.close();
    }
}
