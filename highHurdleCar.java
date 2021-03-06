public class highHurdleCar {
    private String name = "高栏车";//车辆名称
    private int price = 47;//车辆价格
    private double cargo = 2.5;//载货量
    private static int num;//租车数量
    private static int day;//租车时间

    //setter()方法
    public static void setNum(int num) {
        highHurdleCar.num = num;
    }

    public static void setDay(int day) {
        highHurdleCar.day = day;
    }

    //getter()方法
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getCargo() {
        return cargo;
    }

    public static int getNum() {
        return num;
    }

    public static int getDay() {
        return day;
    }

    //展示车辆信息
    public void showCarInfo(){
        System.out.printf("\t\t\t5-名称：低栏车\t\t价格：47元/(辆·天)\t\t载货量：2.5吨\n");
    }

    //展示租车结果
    public static void showResults(){
        if (num != 0){
            System.out.printf("高栏车：租车%d辆，时间为%d天\n", num, day);
        }
    }
}
