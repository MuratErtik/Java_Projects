
package Fan;


public class Test {
    public static void main(String[] args){
        Fan f1 = new Fan();
        System.out.println(f1.fanInfo());
        f1.openFan();
        System.out.println(f1.fanInfo());
        f1.setSpeed(3);
        System.out.println(f1.fanInfo());
        f1.setRadius(8.5);
        System.out.println(f1.fanInfo());
        f1.closeFan();
        System.out.println(f1.fanInfo());
    }
}
