
public class MinMax {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[],int n){
        Pair minmax=new Pair();
        
        if(n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0] > arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }
        else {
            minmax.max=arr[1];
            minmax.min=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>minmax.max)
                minmax.max=arr[i];
            else if(arr[i]<minmax.min)
                minmax.min=arr[i];
        }
        return minmax;
    }
    public static void main(String[] args) {
        int arr[]={99,45,3,76,89,65};
        Pair minmax=getMinMax(arr,6);
        System.out.println("Minimum Element is "+ minmax.min);
        System.out.println("Maximum Element is "+ minmax.max);
    }
    
}
