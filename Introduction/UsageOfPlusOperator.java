package Introduction;

public class UsageOfPlusOperator {
    public static void main(String[] args) {
        System.out.println(2 + 2); //4
        System.out.println("Num: " + 2); //Num: 2
        System.out.println("2" + 2); //"22"
        System.out.println("2" + 2 + 2); //"222" ("2" + 2 = "22" + 2 = "222")
        System.out.println("2" + (2 + 2)); //"24"
        System.out.println(2 + 2 + "2");
    }
}
