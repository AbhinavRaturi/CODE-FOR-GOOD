package Geek_For_Geeks;

public class RecursiveSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,8,9,0};
        int startPoint = 0;
        int endPoint = arr.length-1;
        int key = 9;
        RecursiveSearch rSearch =  new RecursiveSearch();
        System.out.println(rSearch.recursiveSearch(arr, startPoint, endPoint, key));

    }
    boolean recursiveSearch(int[] arr, int startPoint, int endPoint, int val){
        if(endPoint< startPoint)
            return false;
        if(arr[startPoint]== val)
            return true;
        if(arr[endPoint] == val)
            return true;
        return recursiveSearch(arr, startPoint+1, endPoint-1, val);
    }
}
