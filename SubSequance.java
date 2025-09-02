public class SubSequance {
    public static void Subsequance(String  str , int idx , String newString){
        if(idx == str.length()) {
            
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        Subsequance(str , idx+1 , newString+currChar);

        Subsequance(str , idx+1 , newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        Subsequance(str , 0 , " ");
    }
}
