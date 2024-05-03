public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(7);
        System.out.println(p1.gettip());
        // p1.setColor("Yellow");
        p1.setColor("Yellow"); 
        System.out.println(p1.getcolor());
      }
}
class Pen{
   private String color;
   private  int tip;
 
    //getters
    String getcolor(){
        return this.color;
    }
    int gettip(){
      return this.tip;
    }
 
    //setters
    void setColor(String newColor){
        this.color = newColor;   // refer to current object
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
