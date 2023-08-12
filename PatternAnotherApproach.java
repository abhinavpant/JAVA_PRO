public class PatternAnotherApproach{
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printline(int line){
        //Termination Case
        if(line==0){
            return;
        }
        //Small problem + Recursion
        printline(line-1);
        printStar(line);
        System.out.println("");
    }
    public static void main(String args[]){
        printline(5);
    }
}