package binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int numberToBeSearch=Integer.parseInt(args[0]);
        List<Integer>elementList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int highIndexNumber=elementList.size()-1;
        int result=BinarySearch(numberToBeSearch,elementList,0,highIndexNumber);
        if(result==-1){
            System.out.println("Element is not found");
        }else {
            System.out.println(result);
        }
    }
    public static <T extends Comparable<T>>int BinarySearch(T elementToBeSearch,List<T> elementList, int lowIndexNumber, int highIndexNumber){
        if(highIndexNumber>=lowIndexNumber){
            int middleindexnumber=lowIndexNumber+(highIndexNumber-lowIndexNumber)/2;
            if(isAElement(elementToBeSearch, elementList, middleindexnumber)){
                return middleindexnumber;
            }
            else if(elementList.get(middleindexnumber).compareTo(elementToBeSearch)>0){
                return BinarySearch(elementToBeSearch,elementList ,lowIndexNumber,middleindexnumber-1 );
            }
            else {
                return BinarySearch(elementToBeSearch,elementList,middleindexnumber+1,highIndexNumber);
            }
        }
        return -1;
    }

    private static <T extends Comparable<T>> boolean isAElement(T elementToBeSearch, List<T> elementList, int middleindexnumber) {
        return elementList.get(middleindexnumber).equals(elementToBeSearch);
    }

}
