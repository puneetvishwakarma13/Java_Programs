public class ReverseArrayRecursion{
    static void reversearray(int arr[],int start,int end){
        if(start>=end)
            return;
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reversearray(arr, start+1, end-1);
    }
    static void printarray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        printarray(arr, 9);
        System.out.println("Reversed Array");
        reversearray(arr, 0, 8);
        printarray(arr, 9);
    }
}