package binaryTest;

import binary.BinarySearch;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test public void numberInlist(){
        Integer numberlist[]={1,2,3,4,5,6,7,8,9,10,11};
        int expexted=0;
        assertEquals(expexted, BinarySearch.BinarySearch(1,numberlist,0,11));
    }
    @Test public void numberNotInList(){
        Integer numberlist[]={10,20,30,40,50,60,70,80};
        int expected=-1;
        assertEquals(expected,BinarySearch.BinarySearch(90,numberlist,0,7));
    }
}
