package binaryTest;

import binary.BinarySearch;
import binary.Race;
import binary.Runner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test public void elementInList(){
        List<Integer>elementList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int expexted=0;
        assertEquals(expexted, BinarySearch.binarySearch(1,elementList,0,11));
    }
    @Test public void elementInNotInList(){
        List<Integer>numberList= Arrays.asList(10,20,30,40,50,60,70,80);
        int expected=-1;
        assertEquals(expected,BinarySearch.binarySearch(90,numberList,0,7));
    }
    @Test public void stringElementInList(){
        List<String>elementList=Arrays.asList("ankita","bhawana","divya","pooja");
        int expected=3;
        assertEquals(expected,BinarySearch.binarySearch("pooja",elementList,0,4));
    }
    @Test public void doubleElementInList(){
        List<Double>elementList=Arrays.asList(1.1,2.2,3.3,4.4,5.5);
        int expected=2;
        assertEquals(expected,BinarySearch.binarySearch(3.3,elementList,0,5));
    }
    @Test public void objectElement(){
        List<Runner>runners=Arrays.asList();
        Runner runner1=new Runner("ankita");
        Runner runner2=new Runner("bhavan");
        Runner runner3=new Runner("pooja");
        runners.add(runner1);
        runners.add(runner2);
        runners.add(runner3);
        assertEquals(1,BinarySearch.binarySearch(runner3,runners,0,3));
    }
}
