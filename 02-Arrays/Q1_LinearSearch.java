import java.util.Scanner;

public class Q1_LinearSearch{

    public static int linearsearch(int arr[], int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter Key");
        int n = sc.nextInt();

        int index = linearsearch(arr, n);

        System.out.println("Key is at index " + index);
    }
}