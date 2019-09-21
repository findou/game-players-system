public class Player {

    //姓名  例如张三
    private String name;

//    年龄  例如30
    private int age;

//    段位  例如  1：青铜  2：白银  3：黄金  4：钻石  5：王者
    private String degree;

//    等级  例如  1，2， 3
    private int rank;

    public Player() {
    }

    public Player(String name, int age, String degree, int rank) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PlayerException{
        if(age<18)
            throw new PlayerException("年龄必须大于18岁");
        else
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", degree='" + degree + '\'' +
                ", rank=" + rank +
                '}';
    }
}
