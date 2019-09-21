import java.util.ArrayList;
import java.util.Scanner;

/*作业：

        ##### 现需要录入游戏玩家的信息，游戏玩家Player类包含属性

        姓名  例如张三

        年龄  例如30

        段位  例如 王者 青铜

        等级  例如  1，2， 3

        要求：

        游戏玩家年龄必须大于18岁方可录入系统，如不满足抛出异常

        通过ArrayList集合存储每位玩家的信息

        最后按照段位排序规则来打印每一位游戏玩家信息，说明（等级和段位要一一对应，对应表如下下）

        规则需要用户输入（1：从高到低    0 ：从低到高）*/
public class Demo {
    public static void main(String[] args) {
        //创建一个arraylist对象
        ArrayList<Player> alist=new ArrayList();
        Scanner sc= new Scanner(System.in);
        System.out.println("————欢迎录入游戏玩家信息————");
        boolean bdb=true;//判断是否break，退出系统

        do{
            System.out.println("请选择要进行的操作：1：录入玩家信息 2：查看玩家信息 3：退出");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    //录入玩家信息
                    OpPlayer.enterPlayer(alist);
                    break;
                case 2:
                    //查看玩家信息
                    OpPlayer.showPlayer(alist);
                    break;
                case 3:
                    //退出系统
                    System.out.println("欢迎下次使用玩家信息录入系统！！");
                    bdb=false;
                    break;
            }

        }while (bdb);


    }




}
