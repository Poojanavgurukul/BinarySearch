public class BinarySearch {
    public static void main(String[] args) {
        int numberToBeSearch=Integer.parseInt(args[0]);
        Integer numberList[]={1,2,3,4,5,6,7,8,9,10,11};
        int highIndexNumber=numberList.length-1;
        int result=BinarySearch(numberList,0,highIndexNumber,numberToBeSearch);
        if(result==-1){
            System.out.println("Element is not found");
        }else {
            System.out.println(result);
        }
    }
    public static int BinarySearch(Integer numberList[],int lowIndexNumber,int highIndexNumber,int numberToBeSearch){
        if(highIndexNumber>=lowIndexNumber){
            int middleindexnumber=lowIndexNumber+(highIndexNumber-lowIndexNumber)/2;
            if(numberList[middleindexnumber]==numberToBeSearch){
                return middleindexnumber;
            }
            else if(numberList[middleindexnumber]>numberToBeSearch){
                return BinarySearch(numberList ,lowIndexNumber,middleindexnumber-1,numberToBeSearch );
            }
            else {
                return BinarySearch(numberList,middleindexnumber+1,highIndexNumber,numberToBeSearch);
            }
        }
        return -1;
    }
}
