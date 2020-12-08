public class ChartoString {

    public static void main(String[] args) {
       //char to string 
    char cc='L';    
    String ss=Character.toString(cc);  
    System.out.println("String is: "+ss); 


        //String to char
    String s = "Llaggye";
    for(int i=0; i<s.length();i++){
    char ch = s.charAt(i);
    System.out.println("Character at "+i+" Position - "+ch);
                
        }
    }
    
}
