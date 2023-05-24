public class REcipe {
    public static void main(String[] args)
    {

        String[] Ingredients= {"Chicken", "breadcrumbs", "salt", "garlic", "lime"};
        System.out.println("Original");
        System.out.println((Ingredients[0]));
        System.out.println((Ingredients[1]));
        System.out.println((Ingredients[2]));
        System.out.println((Ingredients[3]));
        System.out.println((Ingredients[4]));

        Ingredients[4] = "lemon";
        System.out.println("After Changes");
        System.out.println((Ingredients[0]));
        System.out.println((Ingredients[1]));
        System.out.println((Ingredients[2]));
        System.out.println((Ingredients[3]));
        System.out.println((Ingredients[4]));
    }
}
