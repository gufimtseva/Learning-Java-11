public class FunctionWithInputs {
    
    public static double calculateTotalMealPrice(double leastedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * leastedMealPrice;
        double tax = taxRate * leastedMealPrice;
        double result = leastedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, 0.5, 0.5);
        System.out.println("The total meal price is " + groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println("The individual meal price for each of 5 people is " +  individualMealPrice);
    }
}
