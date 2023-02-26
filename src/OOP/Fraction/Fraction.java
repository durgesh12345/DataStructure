package OOP.Fraction;

public class Fraction {
  private   int numunator ;
   private int denominator;

    public int getNumunator() {
        return numunator;
    }

    public void setNumunator(int numunator) {
        this.numunator = numunator;
       simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
      if (denominator == 0) {
          denominator = 1;

      }
        this.denominator = denominator;
    simplify();
    }


    public Fraction(int numunator, int denominator){
        this.numunator = numunator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numunator ,denominator);
        for (int i = 1; i <= smaller; i++) {
            if (numunator%i == 0 && denominator%i == 0){
                gcd = i;
            }

        }
        numunator = numunator/gcd;
        denominator = denominator/gcd;
    }

    public void increment(){
        numunator = numunator+denominator;
        simplify();
    }
    public void print(){
        System.out.println(numunator+" / "+denominator);
    }


    public void add(Fraction f2){
//        first fraction is the fraction on which funtion is call
//        second fraction pass as a argument
        this.numunator = this.numunator *f2.denominator +this.denominator* f2.numunator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }



}
