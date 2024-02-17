import java.util.Scanner;
public class Speed2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Speed2 speed = new Speed2();
        int bronya_speed = speed.getBronya_speed(s);
        int charactor_speed = speed.charactor_speed(bronya_speed);
        System.out.println("你的主c速度应该要大于"+charactor_speed+"才能在首轮花火拉完条后在鸭鸭前面。");
    }
    public int getBronya_speed(Scanner s){
        System.out.println("请输入鸭鸭的速度:");
        int a = s.nextInt();
        return a;
    }
    public int charactor_speed(int bronya_speed){
        int b_value = 15000/bronya_speed;
        int b_active = (int) (b_value-(10000/bronya_speed)*0.3);
        int c_s = 10000/b_value;
        return c_s;
    }
    public Speed2(){}
}
