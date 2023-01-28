import java.util.Scanner;

JEWEEEEEEEEEEEEEEEESUS


public class sigmagir {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();

        int sum = 0;

        for(int i = -10; i<=m; i++){
            for(int j = 1; j<=n; j++){
                int sorat = (int)Math.pow(i + j, 3);
                sum += sorat/(j*j);
            }
        }
        System.out.println(sum);
    }
}
