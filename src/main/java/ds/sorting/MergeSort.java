package ds.sorting;

/**
 * Created by Vivek on 21-01-2018.
 *  6 8 10 7
 *  mid = 1
 *
 *  for l=0, high= 4,{5}
 *  mid = 2
 */
public class MergeSort {

    void mergeSort(int[] array, int low, int high){

        int mid = (low + high)/2;

        int aLength = mid;
        int bLength = high - mid;

        int l = array.length;
        int i=0,j=0,k=0;

        int[] array1 = new int[aLength];
        int[] array2 = new int[bLength];
        //to divide array in two halfves

        while(i<aLength){
            array1[i++]= array[k++];
        }

        while(j<bLength){
            array2[j++]=array[k++];
        }

        mergeSort(array1,low, mid);
        mergeSort(array2,low,mid);
        merge(array1,array2,array);

      //  int[] array1= array[]

    }

    //this is the main array
    private void merge(int[] array1, int[] array2, int[] array) {
        int i=0,j=0,k=0;
        int a1=array1.length;
        int b1= array2.length;

        while(i<a1 && b1>j){
            if(array1[i]<array2[j]){
                array[k++]=array[i++];
            }
            else {
                array[k++]=array[j++];
            }
        }

        while(i<a1){
            array[k++] = array[i++];
        }
        while(j<b1){
            array[k++] = array[j++];
        }

    }


}
