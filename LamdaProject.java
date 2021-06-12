package lamdaproject;
import java.util.function.BiPredicate;

// NAME : Omar Mohamed Abd El-Hamid
// Group : G_10

public class LamdaProject {

public static String betterString(String s1 , String s2 , BiPredicate<String,String> bi){

    if(bi.test(s1, s2) == true)return s1;
    else return s2;
}    

    public static void main(String[] args) {
     
        BiPredicate<String,String>bi=(s1,s2)->{return s1.length() > s2.length();};
        String StringLonger = betterString("omar","Mohamed",bi);
        System.out.println(StringLonger);
        
        bi=(s1,s2)->{return true;};
        String res = betterString("omar","iiiiiiii",bi);
        System.out.println(res);
        
        
        
    }
    
}
