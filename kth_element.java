import java.util.Arrays;

public class kth_element {
    public static int kthsmallest(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,50,80,20,60,70,90};
        int k=3;
        kthsmallest(arr, k);
        System.out.println("Kth Element is "+kthsmallest(arr, k));
    }
}
