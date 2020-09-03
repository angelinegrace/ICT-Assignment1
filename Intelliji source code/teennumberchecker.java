public class teennumberchecker {
    public static void main (String [] args){
        System.out.println(hasteen(14,99,99));
    }
    public static boolean hasteen(int firstno,int secondno, int thirdno){
        if((firstno>=13 && firstno<=19)||(secondno>=13 && secondno<=19)||(thirdno>=13 && thirdno<=19)) {
            return true;
        }
        else{
            return false;
        }


    }
}

