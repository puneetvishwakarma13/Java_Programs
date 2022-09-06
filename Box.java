public class Box {
    private int lenght , breath , height;
    public void SetDimension(int l,int b,int h){
        lenght=l;
        breath=b;
        height=h;
    }
    public void ShowDimension(){
        System.out.println("l "+lenght);
        System.out.println("b "+breath);
        System.out.println("h "+height);
    }
}
class Test{
    public static void main(String[] args) {
        Box smallbox = new Box();
        smallbox.SetDimension(10, 9, 5);
        smallbox.ShowDimension();
    }
}