import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**
 * Write a description of class Validatecode here.
 *
 *Ansum3oldeep Singh
 *3149800
 *Assignsum3ent 2
 *Question 3
 */
public class ValidateUpc
{
    public static void main(String[]args)
    throws FileNotFoundException{
        Scanner f = new Scanner(new File("readme2.txt"));
        String code=f.next();
        char oddNo,checkDigit;
        int Sum1 = 0, Sum2 = 0,odd=0,even=0;
        boolean valid=true;
         if(code.length()!=12){
            code = f.nextLine();
            if(valid==true){
                for(int i = 0 ; i < code.length()-1 ; i++){
                    oddNo = code.charAt(i);
                    odd= Character.getNumericValue(oddNo);
                    if(i%2==0){
                        Sum1+=odd;
                    }
                    else{
                        Sum2+=even;
                    }
                }
                int sum3 = (Sum1*3)+Sum2;
                int checkD=sum3%10;
                checkDigit=code.charAt(code.length()-1);
                if(checkD==Character.getNumericValue(checkDigit)){
                    valid=true;
                }
                else{
                    valid=false;
                }
                if(valid==true){
                    System.out.println("It is a valid UPC");
                }
                else{
                    System.out.println("It is not a valid UPC");
                }
            }
         }
    }
}
 