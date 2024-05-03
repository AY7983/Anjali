public class SwitchStmt {
    public static void main(String[] args) {
        int number = 2;
        // char ch = b; (we do this for all types of data float, char, bool, etc)
        switch(number){
            case 3 : System.out.println("Samosa");
                     break;
            case 2 : System.out.println("Burger");
                     break;
            case 1 : System.out.println("Chocolate Shake");
                    break;
            default : System.out.println("We realize in our dreams");
        }
    }
}
