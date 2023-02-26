package OOP.Fraction;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,6);
        //f1.print();
//        f1.setNumerator();
//        f1.getNumerator();
      //  f1.increment();
      //  f1.print();

        Fraction f2 = new Fraction(4,8);
        f1.add(f2);
        f1.print();
    }
}
