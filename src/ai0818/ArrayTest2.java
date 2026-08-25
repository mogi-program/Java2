package ai0818;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500, 600, 700};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(i < arr.length - 1){
                System.out.print(arr[i] + " + ");
            }
            else {
                System.out.print(arr[i] + " = ");
            }
        }
        System.out.println(sum);
    }
}
