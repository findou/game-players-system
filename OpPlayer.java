import java.util.ArrayList;
import java.util.Scanner;

public class OpPlayer {
    //创建一个arraylist对象
//    ArrayList alist=new ArrayList();

    //录入玩家信息
    public static ArrayList<Player> enterPlayer(ArrayList<Player> alist){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入玩家姓名：");
        String name=sc.nextLine();
        System.out.println("请输入玩家年龄：");
        int age=sc.nextInt();
        System.out.println("请选择输入玩家等级  例如  1：青铜  2：白银  3：黄金  4：钻石  5：王者");
        int rank=sc.nextInt();
        String degree="";
        switch (rank){
            case 1:
                degree="青铜";
                break;
            case 2:
                degree="白银";
                break;
            case 3:
                degree="黄金";
                break;
            case 4:
                degree="钻石";
                break;
            case 5:
                degree="王者";
                break;
        }
        //创建一个玩家对象
        Player player = new Player();
        //游戏玩家年龄必须大于18岁方可录入系统，如不满足抛出异常
        try {
            player.setAge(age);
        }catch (PlayerException e){
            e.printStackTrace();
        }
        player.setName(name);
        player.setDegree(degree);
        player.setRank(rank);
        alist.add(player);
        System.out.println("玩家信息录入成功！！");
        return alist;

    }
    //显示玩家信息
    public static void print(ArrayList alist,int i){
        for(int j=0;j<alist.size();j++){
            Player pp=(Player)alist.get(j);//找到list中j下表对应存储的对象
            int rank = pp.getRank();//找到这个对象对应的rank值
            if(rank==i){//判断对象的rank值是否等于i
                //如果是相等就会输出
                System.out.println("玩家等级："+pp.getRank()+" 玩家姓名："+pp.getName()+" 玩家年龄："+pp.getAge()+" 玩家段位："+pp.getDegree());
            }
        }
    }
    public static void showPlayer(ArrayList alist){
//        最后按照段位排序规则来打印每一位游戏玩家信息
//        需要用户输入（1：从高到低    0 ：从低到高）
        System.out.println("请选择查看顺序 1：从高到低    0 ：从低到高 ");
        Scanner sc2=new Scanner(System.in);
        int c=sc2.nextInt();
        switch (c){
            case 1:
                //从高到低排序//遍历找到randk 对应再list中的下标
                for(int i=1;i<=5;i++){
                    print(alist,i);
                }
                break;
            case 0:
                //从低到高排序
                for(int i=5;i>0;i--){
                    print(alist,i);
                }
                break;
        }


    }
}

