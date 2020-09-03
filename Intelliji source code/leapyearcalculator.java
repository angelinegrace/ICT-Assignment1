public class leapyearcalculator {
    public static void main(String [] args)
    {
        System.out.println(isLeapYear(1600));
    }
    public static  boolean isLeapYear(int Year)
    {
        if(Year >=1 && Year<=9999){
            return (Year%4==0&&Year%100!=0||Year%400==0&&Year% 100 ==0);

        }
        else{
            return false;
        }
    }
}
