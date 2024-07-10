import java.util.Scanner;

public class simpleArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("how many items do you want to add?");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i;

        for(i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(i = 0; i<size;i++){
            System.out.print(arr[i]+" ");
        } 
    }
}