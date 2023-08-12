public class TreeRecursion{
    static void Branch(int n){
        //Termination Case
        if(n>=3){
            return;// This will backtrack to the previous call and value in the stack 
        }
        //Small Problem + Recursion
        System.out.println(n);
        Branch(n+1);
        Branch(n+2);
    }
    public static void main(String args[]){
       Branch(0);
    }
}