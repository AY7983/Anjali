public class Substring {

    public static String subString(String str , int si , int ei){
      String substr = "";
      for(int i = si ; i < ei ; i++){
        substr += str.charAt(i);
      }
      return substr;
    }
    public static void main(String[] args) {
        //Substring
        String str = "Hi, Guys this side is Anjali Yadav";
        System.out.println(str.substring(0,7));
        // System.out.println(subString(str, 0, 12));

    }

}
