package binaryTest;

import binary.BinarySearch;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test public void numberInList(){
        List<Integer>numberList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int expexted=0;
        assertEquals(expexted, BinarySearch.BinarySearch(1,numberList,0,11));
    }
    @Test public void numberNotInList(){
        List<Integer>numberList= Arrays.asList(10,20,30,40,50,60,70,80);
        int expected=-1;
        assertEquals(expected,BinarySearch.BinarySearch(90,numberList,0,7));
    }
}
