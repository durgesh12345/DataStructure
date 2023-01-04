package StringPr;

public class AllsubSequence {
    public static void main(String[] args) {
        String str = "xyz";
        String[] str1 = findSubsequence(str);
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]+" ");
        }
    }
        private static String[] findSubsequence(String str) {
            if (str.length()==0){
                String ans[] = {""};
                return ans;
            }
            String smallAns[] = findSubsequence(str.substring(1));
            String ans[] = new String[2*smallAns.length];
            int count=0;
            for (int i = 0; i < smallAns.length; i++) {
                ans[i] = smallAns[i];
                count++;
            }
            for (int i = 0; i < smallAns.length; i++) {
                ans[count] = str.charAt(0) +smallAns[i];
                count++;
            }
            return ans;

    }
}
