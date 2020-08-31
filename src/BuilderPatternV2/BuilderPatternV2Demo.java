package BuilderPatternV2;

public class BuilderPatternV2Demo {
    public static void main(String[] args) {
        NutritionFacts coke = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).fat(10).build();
        System.out.println(coke.toString());
    }
}
