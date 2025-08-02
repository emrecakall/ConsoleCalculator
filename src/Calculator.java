public class Calculator {

        public double add(double number1, double number2){
            return number1 + number2;
        }

        public double subtract(double number1, double number2){
            return number1 - number2;
         }

        public double multiply(double number1, double number2){
            return number1 * number2;
        }

        public double divide(double number1, double number2){
            if (number2 == 0) {
                throw new IllegalArgumentException("Sıfıra bölme hatası!");
            }
            return number1 / number2;
        }

         public double getRemainder(double number1, double number2){
             if (number2 == 0) {
                 throw new IllegalArgumentException("Sıfıra göre mod alma hatası!");
             }
             return number1 % number2;
        }
}
