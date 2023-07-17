import java.util.Scanner;



public class MainDiagonalSum {

      static int mainDiagonalSum(int[][] A, int n){
          int sum=0;
          for(int i=0;i<n;i++){
              sum+=A[i][i];
          }
         return sum;

      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                A[i][j]= sc.nextInt();
            }
        }

       int result=mainDiagonalSum(A,row);
        System.out.println(result);
    }
}
