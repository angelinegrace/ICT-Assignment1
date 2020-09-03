public class megabyteconvertor {
    public static void main(String [] args){
         printmegabytesandkilobytes(5000);
    }
    public static void printmegabytesandkilobytes(int kilobytes){
        if(kilobytes<0) {
            System.out.println("Invalidvalue");
        }
        else{
            int megabytes=kilobytes/1024;
            int remainingkilobytes= kilobytes%1024;
            String result=kilobytes + "kb" + "=" + megabytes + "mb" + "and" + remainingkilobytes + "kb";
            System.out.println(result);
        }
    }
}
