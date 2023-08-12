public class ReverseanString
{
    static String reverse(String str){
        if(str.length()==1)
        {
            return str;
        }
        //Small problem
        String SmallString = str.substring(1);
        String Smallresult = reverse(SmallString);
        //Business logic
        char firstchar = str.charAt(0);
        return Smallresult+ firstchar;
    }
    public static void main(String args[])
    {
        System.out.println(reverse("Abhinav"));
    }
    
}