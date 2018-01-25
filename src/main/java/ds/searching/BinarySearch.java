package ds.searching;

/**
 * Created by Vivek on 21-01-2018.
 *
 *
 * 0 2 4 6
 */
public class BinarySearch {


    public int binarySearch(int[] array, int x, int low, int high){
        int mid=low+(high-1)/2;

        if(low>=high){
            return -1;
        }

        if(array[mid]==x){
            return mid;
        }

        if(array[mid]>x){
           return binarySearch(array, x,low, mid-1);
        }

        if(array[mid]<x){
            return binarySearch(array,x,mid+1,high);
        }

        return -1;
    }

    public int binarySearch(int[] array, int x) {
        return binarySearch(array,x,0,array.length-1);
    }
}
