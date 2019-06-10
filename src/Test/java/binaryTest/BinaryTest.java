package binaryTest;

import binary.BinarySearch;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test public void elementInList(){
        List<Integer>elementList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int expexted=0;
        assertEquals(expexted, BinarySearch.BinarySearch(1,elementList,0,11));
    }
    @Test public void elementInNotInList(){
        List<Integer>numberList= Arrays.asList(10,20,30,40,50,60,70,80);
        int expected=-1;
        assertEquals(expected,BinarySearch.BinarySearch(90,numberList,0,7));
    }
    @Test public void stringElementInList(){
        List<String>elementList=Arrays.asList("ankita","bhawana","divya","pooja");
        int expected=3;
        assertEquals(expected,BinarySearch.BinarySearch("pooja",elementList,0,4));
    }
    @Test public void doubleElementInList(){
        List<Double>elementList=Arrays.asList(1.1,2.2,3.3,4.4,5.5);
        int expected=2;
        assertEquals(expected,BinarySearch.BinarySearch(3.3,elementList,0,5));
    }
}
