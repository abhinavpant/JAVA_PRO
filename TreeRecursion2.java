public class TreeRecursion2 {
    static void print(int n){
        //Printing Statement with termination case indirectly mentioned
        if(n>0){
            System.out.println(n);
            //Small problem + Recursion
            print(n-1);
            print(n-2);
        }
    }
    public static void main(String args[]){
        print(3);
    }
}