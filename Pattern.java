public class Pattern {
    static void printStar(int Star){
        if(Star==0){
            return;
        }
        System.out.print("*");
        printStar(Star-1);
    }
    static void printline(int line, int star){
        if(line==0){
            return ;
        }
        //Small Problem + Recursion
        printStar(star); 
        System.out.println("");
        printline(line-1,star+1);
    }
    public static void main(String args[])
    {
        final int MaxRow = 5;
        final int St =1;
        printline(MaxRow,St);
    }
}