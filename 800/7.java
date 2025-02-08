import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            String x = sc.next();
            String s = sc.next(); 

            int res = -1; 
            for(int i=0;i<=5;i++){
                if(x.contains(s)){
                    res = i;
                    break;
                }else{
                    x = x.concat(x);
                }
            }
           System.out.println(res);
        }//End of while loop
        sc.close();
    }
}
