public class SumofDigit
{
    static void sod(int num,int sum)
    {
        if(num==0){
            System.out.println("Sum ="+sum);
            return;
        }
        int  singledigit = num%10;
        sum = sum+ singledigit;
        sod(num/10 , sum);
    }
    public static void main(String args[])
    {
        int num=123;
        int sum = 0;
        sod(num,sum);
    }
}