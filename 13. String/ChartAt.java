public class ChartAt {

    public static void printLetters(String str){
        for(int i = 0; i < str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "Anjali";
        String ert = "12354565";
        System.out.println(name.charAt(3));
        printLetters(name);
        printLetters(ert);
    }
}
