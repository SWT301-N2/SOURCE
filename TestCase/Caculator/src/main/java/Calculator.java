public class Calculator {
    public double add(double a, double b){
        return (double)a + b;
    }

    public double subtraction(double a, double b){
        return (double)a - b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return (double) (double) Math.round((a/b) * 100.0) / 100.0;
        } else {
            System.out.println("You cannot divide by zero");
            return Double.NaN;
        }
    }

    public double time(double a, double b) {
        return (double) Math.round((a*b) * 100.0) / 100.0;
        //Làm tròn với 2 chữ số sau dấu chấm
    }
}
