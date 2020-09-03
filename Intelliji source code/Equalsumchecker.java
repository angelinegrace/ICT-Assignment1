public class Equalsumchecker {
    public static void main (String[] args){
        System.out.println(hasEqualsum(2,1,3));
    }
    public static boolean hasEqualsum(int firstnumber,int secondnumber,int thirdnumber){
       if(firstnumber + secondnumber == thirdnumber) {
           return true;
       }
           else{
               return false;

           }
       }
    }



