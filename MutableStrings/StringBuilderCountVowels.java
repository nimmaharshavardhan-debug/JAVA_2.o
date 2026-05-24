package MutableStrings;

public class StringBuilderCountVowels {
    public static void main(String [] args){
        StringBuilder name = new StringBuilder("Harsha Vardhan N");
    
        StringBuilder  vowels = new StringBuilder("aeiouAEIOU");
        int count = 0 ;
        for (int i=0;i<name.length();i++){
            for (int j=0;j<vowels.length();j++){
                if (name.charAt(i)==vowels.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("No of Vowels : "+count);
        
    }
    
}
