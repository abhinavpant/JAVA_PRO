public class Factorial
{
    static int factorial(int fact)
    {
        if(fact==1||fact==0){
            return 1;
        }
        int result = factorial(fact-1);
        return result* fact;// Small problem
    }
    static void factorial(int fact,int result){
        if(fact==1 || fact ==0){
            System.out.println(result);
            return;
        }
        //small problem
        factorial(fact-1 , result*fact);
    }
    public static void main(String args[])
    {
        //Factorial(4,1);
        System.out.println(factorial(4));
        
    }
}