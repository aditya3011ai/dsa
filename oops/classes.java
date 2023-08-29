public class classes {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setPrice(150);
        System.out.println(p1.price);
        p1.setName("PARKER");
        System.out.println(p1.name);
     }
}
class Pen{
    String name;
    int price;
    void setName(String name){
        this.name =name;
    }
    void setPrice (int price){
        this.price=price;
    }
}
