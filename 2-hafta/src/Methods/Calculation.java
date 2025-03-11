package Methods;

public class Calculation {

        public void showTitle(){
        System.out.println("Hoş Geldiniz!");
        }

        public int calculateSquare (int number){
            return number * number;
        }

        protected void addNumbers(int number1, int number2){

        int sum = number1 + number2;

        System.out.println("Toplam: " + sum);
        }

        private double addNumbers(double number1, double number2) {

            double sum = number1 + number2;

            return sum;
        }

    double pi = 3.14;

        protected double addNumbers() {
            double pi = 3;
            return 10*pi;
        }

        protected void addNumbers1() {
            // boş bir method fakat geçerli bir method

            System.out.println(10*pi);
        }






}
