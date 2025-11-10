public static void main(String[] args){
    int number=-25;
    try{
        validateNumber(number);
    } catch(NegativeNumberException e) {
        System.out.println("Caught Exception: "+ e.getMessage());
    }
}class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
    public class throus{
        public static void validateNumber(double number)
            throws  NegativeNumberException{
                number=Math.pow(number,0.5);
        if (number<0){
            throw new NegativeNumberException("Number is negative.");
        }
        System.out.println("Number is Positive");
    } applicationn{ain(String[] args){
    int number=-25;