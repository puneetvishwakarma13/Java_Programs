public class ReverseArray{
    static void reverseArray(int arr[],int start,int end){
        for(start=0;start<end;start++){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
        }
    }
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        printArray(arr,15);
        reverseArray(arr,0,14);
        System.out.println("Reversed Array is=");
        printArray(arr,15);
    }
}

