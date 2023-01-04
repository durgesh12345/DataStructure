package StringPr;

public class SubString {
    public static void main(String[] args) {
        String str = "xy";
        printSubSequences(str);
    }

    private static void printSubSequences(String input) {

        printSubSequences(input,"");
    }

    private  static void printSubSequences(String input,String outputSofar){
        if (input.length() == 0){
            System.out.println(outputSofar);
            return;
        }
//        we choose not to include first character
        printSubSequences(input.substring(1),outputSofar);
//        we choose we include first character
        printSubSequences(input.substring(1),outputSofar+input.charAt(0));
    }
}
