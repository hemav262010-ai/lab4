import java.util.Scanner;
public class matrixaddition {
public static void main(String[]args){
Scanner sc= new Scanner (System.in);
System.out.println("Enter the order N of the matrices:");
int N= sc.nextInt();
if(N<=0){
System.out.println("Invalid matrix order");
return;
}
int [][] matrix1= new int [N][N];
int [][] matrix2= new int [N][N];
int [][] sum= new int [N][N];
System.out.println("Enter elements of matrix1:");
for(int i=0; i<N; i++){
for(int j=0; j<N; j++){
matrix1[i][j]=sc.nextInt();
}
}
System.out.println("enter elements of matrix2:");
for(int i=0; i<N; i++){
for(int j=0; j<N; j++){
matrix2[i][j]=sc.nextInt();
}
}
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
sum[i][j]=matrix1[i][j]+matrix2[i][j];
} 
}
System.out.println("sum of the two matrices:");
for(int i=0; i<N; i++){
for(int j=0; j<N; j++){
System.out.println(sum[i][j]+"\t");
}
System.out.println();
}
sc.close();
}
}
