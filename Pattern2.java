public class Pattern2{
    static void printStar(int star){
        if(star==0){
            return;
        }
        printStar(star-1);
        System.out.print("*");
    }
    static void printLine(int line){
        //Termination Case
        if(line==0){
            return;
        }
        printStar(line);
        System.out.println("");
        printLine(line-1);
    }
    public static void main(String args[]){
        printLine(5);
}
}