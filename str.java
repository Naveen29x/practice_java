public class str {

    public static String merge(String word1,String word2){

        String nayaString=" ";
         int i=0;
          int j=0;
          while(i<word1.length() && j<word2.length()){
            nayaString=nayaString+word1.charAt(i);
            nayaString=nayaString+word2.charAt(j);
            i++;
            j++;
          }
        return nayaString; 

    }

    public static void main(String[] args) {
        /*merge the two string:
        input str1="abc"
               str2="pqr";
        output= apbqcr


        */
        
        
        String word1="abc";
        String word2="pqrs";
        String str3=merge(word1, word2);
        System.out.println(str3);
        
    
}
}
