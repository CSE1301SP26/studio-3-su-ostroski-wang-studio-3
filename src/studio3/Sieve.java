import java.util.Scanner;




public class Sieve {

public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Choose an integer: ");
    
    int n = in.nextInt();
    System.out.println(" ");
    System.out.println(" ");
int[] array = new int[n];
for(int i=0;i<n;i++){
    array[i] = i+1;
}

for (int i=2;i*i<n;i++){
    int j=2;
    while(i*j <=n) {
        array[i*j-1]=0;
        j++;
    }

array[0]=0;



}
int count = 0;
for(int i=0;i<n;i++){
    if(array[i] != 0){
    System.out.println(array[i]);
    count++;
}



}
System.out.println("There are " +count+ " primes less than or equal to " +n+ ".");



}
}


