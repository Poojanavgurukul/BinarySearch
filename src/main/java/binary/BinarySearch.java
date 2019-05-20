package binary;
public class BinarySearch {
    public static void main(String[] args) {
        int numberToBeSearch=Integer.parseInt(args[0]);
        Integer numberList[]={1,2,3,4,5,6,7,8,9,10,11};
        int highIndexNumber=numberList.length-1;
        int result=BinarySearch(numberToBeSearch,numberList,0,highIndexNumber);
        if(result==-1){
            System.out.println("Element is not found");
        }else {
            System.out.println(result);
        }
    }
    public static int BinarySearch(int numberToBeSearch,Integer[] numberList, int lowIndexNumber, int highIndexNumber){
        if(highIndexNumber>=lowIndexNumber){
            int middleindexnumber=lowIndexNumber+(highIndexNumber-lowIndexNumber)/2;
            if(isNumberFound(numberToBeSearch, numberList[middleindexnumber])){
                return middleindexnumber;
            }
            else if(numberList[middleindexnumber]>numberToBeSearch){
                return BinarySearch(numberToBeSearch,numberList ,lowIndexNumber,middleindexnumber-1 );
            }
            else {
                return BinarySearch(numberToBeSearch,numberList,middleindexnumber+1,highIndexNumber);
            }
        }
        return -1;
    }

    private static boolean isNumberFound(int numberToBeSearch, Integer integer) {
        return integer == numberToBeSearch;
    }
}
