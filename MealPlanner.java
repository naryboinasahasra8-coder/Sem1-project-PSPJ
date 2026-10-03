import java.util.Scanner;

public class MealPlanner  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayTitle();

        int day = selectDay(sc);

        String dayName = dayName(day);

        int meal = selectMeal(sc);

        displayItemMenu(meal);

        int item = selectItem(sc);

        int people = selectPeople(sc);

        displayPlanHeader(dayName, people);

        processMeal(meal, item, people);

        System.out.println("--------------------------");
        System.out.println("MEAL PLANNED SUCCESSFULLY!");
        System.out.println("--------------------------");

        sc.close();
    }


        public static void displayTitle() {

        System.out.println("------------------------------------------");
        System.out.println("WEEKLY MEAL PLANNER AND GROCERY GENERATOR");
        System.out.println("------------------------------------------");
    }

        public static int selectDay(Scanner sc) {

        int day;

        System.out.println("SELECT A DAY");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");

        do {
            System.out.print("Enter your choice: ");
            day = sc.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("Invalid choice! Enter from 1 to 7.");
            }
        } while (day < 1 || day > 7);

        System.out.println("Selected Day: " + dayName(day));
        return day;
    }

    public static String dayName(int day) {
        switch (day) {
            case 1: return "MONDAY";
            case 2: return "TUESDAY";
            case 3: return "WEDNESDAY";
            case 4: return "THURSDAY";
            case 5: return "FRIDAY";
            case 6: return "SATURDAY";
            case 7: return "SUNDAY";
            default: return "INVALID DAY";
        }
    }


        public static int selectMeal(Scanner sc) {

        int meal;

        System.out.println("------------------------------------------");
        System.out.println("SELECT MEAL TYPE");
        System.out.println("1. BREAKFAST");
        System.out.println("2. LUNCH");
        System.out.println("3. SNACKS");
        System.out.println("4. DINNER");

        do {

            System.out.print("Enter your choice: ");

            meal = sc.nextInt();

            switch (meal) {

                case 1:
                    System.out.println("Selected Meal: BREAKFAST");
                    break;

                case 2:
                    System.out.println("Selected Meal: LUNCH");
                    break;

                case 3:
                    System.out.println("Selected Meal: SNACKS");
                    break;

                case 4:
                    System.out.println("Selected Meal: DINNER");
                    break;

                default:
                    System.out.println("Invalid choice! Enter from 1 to 4.");
            }

        } while (meal < 1 || meal > 4);

        return meal;
    }


        public static void displayItemMenu(int meal) {

        System.out.println("------------------------------------------");

        switch (meal) {

            case 1:

                System.out.println("SELECT A BREAKFAST ITEM");

                System.out.println("1. Masala Dosa");
                System.out.println("2. Idli Sambar");
                System.out.println("3. Aloo Paratha");
                System.out.println("4. Vegetable Upma");
                System.out.println("5. Poori with Potato Curry");
                System.out.println("6. Pancakes");
                System.out.println("7. French Toast");
                System.out.println("8. Sandwich");
                System.out.println("9. Bread Omelette");
                System.out.println("10. Cereal");

                break;


            case 2:

                System.out.println("SELECT A LUNCH ITEM");

                System.out.println("1. Vegetable Biryani");
                System.out.println("2. Chicken Biryani");
                System.out.println("3. Paneer Butter Masala with Naan");
                System.out.println("4. Rajma Rice");
                System.out.println("5. Dal Tadka with Jeera Rice");
                System.out.println("6. White Sauce Pasta");
                System.out.println("7. Vegetable Fried Rice");
                System.out.println("8. Chicken Noodles");
                System.out.println("9. Margherita Pizza");
                System.out.println("10. Grilled Chicken with Mashed Potatoes");

                break;


            case 3:

                System.out.println("SELECT A SNACK ITEM");

                System.out.println("1. Samosa");
                System.out.println("2. Paneer Tikka");
                System.out.println("3. Vegetable Pakoda");
                System.out.println("4. Bhel Puri");
                System.out.println("5. Aloo Tikki");
                System.out.println("6. French Fries");
                System.out.println("7. Veg Burger");
                System.out.println("8. Chicken Sandwich");
                System.out.println("9. Vegetable Spring Rolls");
                System.out.println("10. Garlic Bread");

                break;


            case 4:

                System.out.println("SELECT A DINNER ITEM");

                System.out.println("1. Butter Chicken with Naan");
                System.out.println("2. Shahi Paneer with Roti");
                System.out.println("3. Dal Makhani with Jeera Rice");
                System.out.println("4. Vegetable Pulao");
                System.out.println("5. Chicken Curry with Chapati");
                System.out.println("6. Red Sauce Pasta");
                System.out.println("7. Vegetable Noodles");
                System.out.println("8. Chicken Fried Rice");
                System.out.println("9. Grilled Fish with Vegetables");
                System.out.println("10. Vegetable Pizza");

                break;
        }
    }


       public static int selectItem(Scanner sc) {

        int item;

        do {

            System.out.print("Enter item choice: ");

            item = sc.nextInt();

            if (item < 1 || item > 10) {

                System.out.println("Invalid choice! Enter from 1 to 10.");
            }

        } while (item < 1 || item > 10);

        return item;
    }


        public static int selectPeople(Scanner sc) {

        int people;

        do {

            System.out.print("Enter number of people: ");

            people = sc.nextInt();

            if (people <= 0) {

                System.out.println("Enter at least 1 person.");
            }

        } while (people <= 0);

        return people;
    }




        public static void displayPlanHeader(String dayName, int people) {

        System.out.println("------------------------------------------");

        System.out.println("Day: " + dayName);

        System.out.println("Number of People: " + people);

        System.out.println("------------------------------------------");
    }




       public static void processMeal(int meal, int item, int people) {

        switch (meal) {

            case 1:

                breakfast(item, people);

                break;


            case 2:

                lunch(item, people);

                break;


            case 3:

                snacks(item, people);

                break;


            case 4:

                dinner(item, people);

                break;
        }
    }



        public static void breakfast(int item, int people) {

        switch (item) {

            case 1:

                display("Masala Dosa", people,
                        "Rice", 100, "grams",
                        "Urad Dal", 30, "grams",
                        "Potato", 100, "grams",
                        "Coconut", 25, "grams",
                        "Oil", 15, "ml");

                break;


            case 2:

                display("Idli Sambar", people,
                        "Rice", 100, "grams",
                        "Urad Dal", 30, "grams",
                        "Toor Dal", 40, "grams",
                        "Vegetables", 75, "grams",
                        "Sambar Powder", 5, "grams");

                break;


            case 3:

                display("Aloo Paratha", people,
                        "Wheat Flour", 100, "grams",
                        "Potato", 120, "grams",
                        "Curd", 100, "grams",
                        "Butter", 15, "grams",
                        "Spices", 5, "grams");

                break;


            case 4:

                display("Vegetable Upma", people,
                        "Semolina", 80, "grams",
                        "Vegetables", 75, "grams",
                        "Onion", 30, "grams",
                        "Oil", 10, "ml",
                        "Peanuts", 15, "grams");

                break;


            case 5:

                display("Poori with Potato Curry", people,
                        "Wheat Flour", 100, "grams",
                        "Potato", 150, "grams",
                        "Onion", 40, "grams",
                        "Oil", 40, "ml",
                        "Spices", 5, "grams");

                break;


            case 6:

                display("Pancakes", people,
                        "Flour", 80, "grams",
                        "Milk", 100, "ml",
                        "Egg", 1, "piece",
                        "Butter", 15, "grams",
                        "Honey", 20, "ml");

                break;


            case 7:

                display("French Toast", people,
                        "Bread", 3, "slices",
                        "Egg", 1, "piece",
                        "Milk", 60, "ml",
                        "Sugar", 15, "grams",
                        "Butter", 10, "grams");

                break;


            case 8:

                display("Sandwich", people,
                        "Bread", 4, "slices",
                        "Vegetables", 100, "grams",
                        "Cheese", 40, "grams",
                        "Butter", 15, "grams",
                        "Tomato Sauce", 20, "grams");

                break;


            case 9:

                display("Bread Omelette", people,
                        "Bread", 4, "slices",
                        "Egg", 2, "pieces",
                        "Onion", 30, "grams",
                        "Tomato", 30, "grams",
                        "Oil", 10, "ml");

                break;


            case 10:

                display("Cornflakes", people,
                        "Cornflakes", 50, "grams",
                        "Milk", 200, "ml",
                        "Banana", 1, "piece",
                        "Apple", 1, "piece",
                        "Honey", 10, "ml");

                break;
        }
    }



    public static void lunch(int item, int people) {

        switch (item) {

            case 1:

                display("Vegetable Biryani", people,
                        "Basmati Rice", 100, "grams",
                        "Vegetables", 120, "grams",
                        "Curd", 100, "grams",
                        "Onion", 50, "grams",
                        "Biryani Masala", 8, "grams");

                break;


            case 2:

                display("Chicken Biryani", people,
                        "Basmati Rice", 100, "grams",
                        "Chicken", 180, "grams",
                        "Curd", 50, "grams",
                        "Onion", 60, "grams",
                        "Biryani Masala", 8, "grams");

                break;


            case 3:

                display("Paneer Butter Masala with Naan", people,
                        "Paneer", 150, "grams",
                        "Tomato", 100, "grams",
                        "Cream", 40, "ml",
                        "Butter", 20, "grams",
                        "Naan", 2, "pieces");

                break;


            case 4:

                display("Rajma Rice", people,
                        "Kidney Beans", 80, "grams",
                        "Rice", 100, "grams",
                        "Tomato", 60, "grams",
                        "Onion", 40, "grams",
                        "Spices", 6, "grams");

                break;


            case 5:

                display("Dal Tadka with Jeera Rice", people,
                        "Toor Dal", 70, "grams",
                        "Rice", 100, "grams",
                        "Tomato", 50, "grams",
                        "Ghee", 15, "grams",
                        "Cumin Seeds", 3, "grams");

                break;


            case 6:

                display("White Sauce Pasta", people,
                        "Pasta", 100, "grams",
                        "Milk", 150, "ml",
                        "Cheese", 40, "grams",
                        "Vegetables", 80, "grams",
                        "Butter", 15, "grams");

                break;


            case 7:

                display("Vegetable Fried Rice", people,
                        "Rice", 100, "grams",
                        "Vegetables", 100, "grams",
                        "Spring Onion", 30, "grams",
                        "Soy Sauce", 10, "ml",
                        "Oil", 15, "ml");

                break;


            case 8:

                display("Chicken Noodles", people,
                        "Noodles", 100, "grams",
                        "Chicken", 120, "grams",
                        "Vegetables", 80, "grams",
                        "Soy Sauce", 10, "ml",
                        "Oil", 15, "ml");

                break;


            case 9:

                display("Margherita Pizza", people,
                        "Pizza Base", 1, "piece",
                        "Pizza Sauce", 50, "grams",
                        "Cheese", 100, "grams",
                        "Tomato", 50, "grams",
                        "Mixed Herbs", 3, "grams");

                break;


            case 10:

                display("Grilled Chicken with Mashed Potatoes", people,
                        "Chicken", 200, "grams",
                        "Potato", 180, "grams",
                        "Butter", 20, "grams",
                        "Milk", 50, "ml",
                        "Mixed Herbs", 5, "grams");

                break;
        }
    }



    public static void snacks(int item, int people) {

        switch (item) {

            case 1:

                display("Samosa", people,
                        "Flour", 60, "grams",
                        "Potato", 100, "grams",
                        "Green Peas", 30, "grams",
                        "Oil", 30, "ml",
                        "Green Chutney", 30, "grams");

                break;


            case 2:

                display("Paneer Tikka", people,
                        "Paneer", 150, "grams",
                        "Curd", 50, "grams",
                        "Capsicum", 50, "grams",
                        "Onion", 50, "grams",
                        "Tikka Masala", 8, "grams");

                break;


            case 3:

                display("Vegetable Pakoda", people,
                        "Gram Flour", 80, "grams",
                        "Onion", 60, "grams",
                        "Potato", 60, "grams",
                        "Spinach", 40, "grams",
                        "Oil", 30, "ml");

                break;


            case 4:

                display("Bhel Puri", people,
                        "Puffed Rice", 60, "grams",
                        "Sev", 30, "grams",
                        "Onion", 30, "grams",
                        "Tomato", 30, "grams",
                        "Chutney", 30, "grams");

                break;


            case 5:

                display("Aloo Tikki", people,
                        "Potato", 150, "grams",
                        "Bread Crumbs", 30, "grams",
                        "Green Peas", 30, "grams",
                        "Oil", 20, "ml",
                        "Chutney", 30, "grams");

                break;


            case 6:

                display("French Fries", people,
                        "Potato", 200, "grams",
                        "Oil", 30, "ml",
                        "Salt", 3, "grams",
                        "Chilli Powder", 2, "grams",
                        "Tomato Sauce", 30, "grams");

                break;


            case 7:

                display("Veg Burger", people,
                        "Burger Bun", 1, "piece",
                        "Vegetable Patty", 1, "piece",
                        "Cheese", 20, "grams",
                        "Vegetables", 50, "grams",
                        "Mayonnaise", 20, "grams");

                break;


            case 8:

                display("Chicken Sandwich", people,
                        "Bread", 4, "slices",
                        "Chicken", 100, "grams",
                        "Vegetables", 50, "grams",
                        "Mayonnaise", 25, "grams",
                        "Cheese", 30, "grams");

                break;


            case 9:

                display("Vegetable Spring Rolls", people,
                        "Spring Roll Sheets", 3, "pieces",
                        "Cabbage", 70, "grams",
                        "Carrot", 50, "grams",
                        "Capsicum", 40, "grams",
                        "Oil", 30, "ml");

                break;


            case 10:

                display("Garlic Bread", people,
                        "Bread", 4, "slices",
                        "Garlic", 10, "grams",
                        "Butter", 25, "grams",
                        "Cheese", 50, "grams",
                        "Mixed Herbs", 3, "grams");

                break;
        }
    }



    public static void dinner(int item, int people) {

        switch (item) {

            case 1:

                display("Butter Chicken with Naan", people,
                        "Chicken", 180, "grams",
                        "Tomato", 100, "grams",
                        "Butter", 25, "grams",
                        "Cream", 40, "ml",
                        "Flour", 200, "grams");

                break;


            case 2:

                display("Shahi Paneer with Roti", people,
                        "Paneer", 150, "grams",
                        "Tomato and Onion", 100, "grams",
                        "Cream", 40, "ml",
                        "Cashews", 20, "grams",
                        "Flour", 200, "grams");

                break;


            case 3:

                display("Dal Makhani with Jeera Rice", people,
                        "Black Gram", 80, "grams",
                        "Kidney Beans", 30, "grams",
                        "Rice", 100, "grams",
                        "Butter", 20, "grams",
                        "Cream", 30, "ml");

                break;


            case 4:

                display("Vegetable Pulao", people,
                        "Basmati Rice", 100, "grams",
                        "Vegetables", 100, "grams",
                        "Curd", 100, "grams",
                        "Onion", 40, "grams",
                        "Pulao Masala", 5, "grams");

                break;


            case 5:

                display("Chicken Curry with Chapati", people,
                        "Chicken", 180, "grams",
                        "Tomato and Onion", 120, "grams",
                        "Wheat Flour", 120, "grams",
                        "Oil", 20, "ml",
                        "Curry Masala", 8, "grams");

                break;


            case 6:

                display("Red Sauce Pasta", people,
                        "Pasta", 100, "grams",
                        "Tomato", 120, "grams",
                        "Vegetables", 80, "grams",
                        "Cheese", 30, "grams",
                        "Mixed Herbs", 4, "grams");

                break;


            case 7:

                display("Vegetable Noodles", people,
                        "Noodles", 100, "grams",
                        "Cabbage", 50, "grams",
                        "Carrot and Capsicum", 70, "grams",
                        "Soy Sauce", 10, "ml",
                        "Oil", 15, "ml");

                break;


            case 8:

                display("Chicken Fried Rice", people,
                        "Rice", 100, "grams",
                        "Chicken", 120, "grams",
                        "Vegetables", 80, "grams",
                        "Soy Sauce", 10, "ml",
                        "Oil", 15, "ml");

                break;


            case 9:

                display("Grilled Fish with Vegetables", people,
                        "Fish", 200, "grams",
                        "Vegetables", 150, "grams",
                        "Butter", 15, "grams",
                        "Lemon", 1, "piece",
                        "Mixed Herbs", 4, "grams");

                break;


            case 10:

                display("Vegetable Pizza", people,
                        "Pizza Base", 1, "piece",
                        "Pizza Sauce", 50, "grams",
                        "Vegetables", 100, "grams",
                        "Cheese", 100, "grams",
                        "Mixed Herbs", 3, "grams");

                break;
        }
    }



    public static void display(

            String itemName,

            int people,

            String ingredient1, double quantity1, String unit1,

            String ingredient2, double quantity2, String unit2,

            String ingredient3, double quantity3, String unit3,

            String ingredient4, double quantity4, String unit4,

            String ingredient5, double quantity5, String unit5) {


        System.out.println("Selected Item: " + itemName);

        System.out.println("------------------------------------------");

        System.out.println("INGREDIENTS REQUIRED FOR " + people + " PEOPLE");

        System.out.println("------------------------------------------");


        System.out.println(ingredient1 + ": " + (quantity1 * people) + " " + unit1);


        System.out.println(ingredient2 + ": " + (quantity2 * people) + " " + unit2);

        System.out.println(ingredient3 + ": " + (quantity3 * people) + " " + unit3);

        System.out.println(ingredient4 + ": " + (quantity4 * people) + " " + unit4 );

        System.out.println(ingredient5 + ": " + (quantity5 * people) + " " + unit5 );

}
}








                                               
        

                                                      


                
                                      

                                                                  





















