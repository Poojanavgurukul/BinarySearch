public class BinarySearch {
    public static void main(String[] args) {
        int numberToBeSearch=Integer.parseInt(args[0]);
        Integer numberList[]={1,2,3,4,5,6,7,8,9,10,11};
        int highIndexNumber=numberList.length;
        int lowIndexNumber=0;
        for (int i = 0; i <numberList.length ; i++) {
            int middleIndexNumber=(highIndexNumber+lowIndexNumber)/2;
            if(numberList[middleIndexNumber]==numberToBeSearch){
                System.out.println(middleIndexNumber);
                return;
            }
            else if(numberList[middleIndexNumber]>numberToBeSearch){
                highIndexNumber=middleIndexNumber;
            }
            else if(numberList[middleIndexNumber]<numberToBeSearch){
                lowIndexNumber=middleIndexNumber;
            }
        }
        System.out.println("Element is not found");
    }
}
