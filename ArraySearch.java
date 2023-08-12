public class ArraySearch {
    static int SearchArray(int arr[], int index, int searchValue){
        //Termination case
        if(arr[index]==searchValue)
        {
            return index;
        }
        if(arr[index]==arr.length){
            return -1;
        }
        //Small problem + recursion
        return SearchArray(arr,index+1,searchValue);
    }
    public static void main(String args[])
    {
        int arr[] = {10,53,64,20,48,60};
        System.out.println(SearchArray(arr,0,64)>=0?"The element is present at index.":"The element is not present");
    }
}
