public class Classroom {

    public static void main(String[] args) {
        Wilder myName = new Wilder("Elodie", false);
        System.out.println(myName.whoAmI());

        Wilder lucas = new Wilder("Lucas", true);
        System.out.println(lucas.whoAmI());

        Wilder robert = new Wilder("Robert", false);
        System.out.println(robert.whoAmI());
    }
}