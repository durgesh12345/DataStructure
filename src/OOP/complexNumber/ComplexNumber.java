package OOP.complexNumber;

public class ComplexNumber {
    private  int Real;
    private int Imaginary;

    public void setImaginary(int imaginary) {
        Imaginary = imaginary;
    }

    public int getReal() {
        return Real;
    }

    public void setReal(int real) {
        Real = real;
    }

    public ComplexNumber(int Real, int Imaginary){
        this.Real = Real;
        this.Imaginary = Imaginary;
    }

    public void print(){
        System.out.println(Real+" : "+Imaginary);
    }

    public void add(ComplexNumber c2){
        this.Real = this.Real+c2.Real;
        this.Imaginary = this.Imaginary+c2.Imaginary;

    }

    public int multiply(ComplexNumber c2){
        int a = (this.Real*c2.Real)+(this.Real*c2.Imaginary)+(this.Imaginary*c2.Real)+(-(this.Imaginary*c2.Imaginary));
        return a;

    }

    public void add(ComplexNumber c1,ComplexNumber c2){

    }
}
