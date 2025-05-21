
class Computer
{
    public void PlayMusic() {
        System.out.println("Music Playing....");
    }

    public String BuyPen(int cost) {
        if (cost <= 10) {
            return "Insufficient Money. A pen goes for Ksh. 15";
        };

        return "Pen Bought Successfully";
    }
}
 
public class Methods
{
    public static void main(String a[]) {

        Computer comp = new Computer();

        comp.PlayMusic();

        String str = comp.BuyPen(15);

        System.out.println(str);

    }
}