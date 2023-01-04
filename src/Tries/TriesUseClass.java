package Tries;

public class TriesUseClass {
    public static void main(String[] args) {
        Tries t = new Tries();
        t.add("NOTE");

        System.out.println(t.search("NOTE"));
        t.remove("AND");
        t.remove("NOTE");
        System.out.println(t.search("NOTE"));
    }
}
