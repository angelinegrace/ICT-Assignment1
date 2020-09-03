public class Decimalcomperator {
    public static void main(String [] args){
        System.out.println(areEqualbyThreeDecimalplaces(-3.175,-3.175));
    }
    public static boolean areEqualbyThreeDecimalplaces(double firstno,double secondno){
        if( (int) (firstno*1000) == (int) (secondno*1000) ) {
            return true;
        }
            else{
                return false;
            }

        }

        
    }

