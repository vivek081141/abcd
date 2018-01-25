package ds.searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vivek on 25-01-2018.
 */
public class BinarySearchTest {

    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testBinarySearch(){
        int array[]={1,3,5,7,9,10};
        Assert.assertEquals(4,binarySearch.binarySearch(array, 9));
    }

    @Test
    public void testBinarySearch_end(){
        int array[]={1,3,5,7,9,10};
        Assert.assertEquals(5,binarySearch.binarySearch(array, 10));
    }

    @Test
    public void testBinarySearch_start(){
        int array[]={1,3,5,7,9,10};
        Assert.assertEquals(0,binarySearch.binarySearch(array, 1));
    }

    @Test
    public void testBinarySearchNotFound(){
        int array[]={1,3,5,7,9,10};
        Assert.assertEquals(-1,binarySearch.binarySearch(array, 4));
    }

}
