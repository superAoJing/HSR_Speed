import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Speed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your current speed:");
        double yourSpeedIs = s.nextInt();//输入速度
        double lowerSpeed = yourSpeedIs - 10;
        double higherSpeed = yourSpeedIs + 10;
        boolean successfulRun = false;
        ArrayList<Double>speedList = new ArrayList<>();
        speedList.add(133.33);
        speedList.add(120.00);
        speedList.add(160.00);
        speedList.add(114.29);
        speedList.add(142.86);
        speedList.add(111.11);
        speedList.add(171.43);
        speedList.add(109.09);
        speedList.add(133.33);
        speedList.add(155.56);
        speedList.add(127.27);
        speedList.add(107.69);
        speedList.add(177.78);
        speedList.add(145.45);
        speedList.add(123.08);
        speedList.add(106.67);
        speedList.add(163.64);
        speedList.add(138.46);
        speedList.add(120.00);
        speedList.add(105.88);
        speedList.add(153.85);
        speedList.add(133.33);
        speedList.add(117.65);
        speedList.add(105.26);
        speedList.add(169.23);
        speedList.add(146.67);
        speedList.add(129.41);
        speedList.add(115.79);
        speedList.add(104.76);
        speedList.add(160.00);
        speedList.add(141.18);
        speedList.add(126.32);
        speedList.add(114.29);
        speedList.add(173.33);
        speedList.add(152.94);
        speedList.add(136.84);
        speedList.add(123.81);
        speedList.add(164.71);
        speedList.add(147.37);
        speedList.add(133.33);
        speedList.add(176.47);
        speedList.add(157.89);
        speedList.add(142.86);
        for (double speed : speedList) {
            if (speed < yourSpeedIs && yourSpeedIs - speed <= yourSpeedIs - lowerSpeed)
                lowerSpeed = speed;
            else if (speed > yourSpeedIs && speed - yourSpeedIs <= higherSpeed - yourSpeedIs)
                higherSpeed = speed;
        }
        double needSpeed = higherSpeed - yourSpeedIs;
        System.out.println("你的上一个速度关键区间为" + lowerSpeed + "你的下一个速度关键区间为" + higherSpeed);
        if (needSpeed < 1) {
            System.out.println("你只需要" + needSpeed + "点速度就可以提升到下个关键区间了,加油！");
            successfulRun = true;
        } else
            System.out.println("你还需要" + needSpeed + "点速度才能提升到下个关键区间,还需努力！");
        successfulRun = true;
        if (!successfulRun) {
            System.out.println("错误！请检查输入速度");
        }//应该不会触发这个
        Iterator<Double>interation=speedList.iterator();
        /*while(interation.hasNext()){
            System.out.println(interation.next());
        }可以检查速度数据库 如果需要删掉注释符*/
    }
}