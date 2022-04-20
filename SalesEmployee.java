package employ;
//创建第三种员工的类
public class SalesEmployee extends Employee {
    private int sale;   //定义销售额
    private int month;  //定义员工的生日月份
    private int rate=18;   //定义提成率（以百分制记），以18%为例
    public void setsale(int sale){
        this.sale=sale;
    }
    public void setmonth(int month){
        this.month=month;
    }
    @Override
    public int getSalary(int month){
        int temp=0;   //用于接收是否有生日奖金
        double salary=0;
        if(getmounth()==month) {
            temp = 100;  //员工当前月份生日，奖励100元,否则为0
        }
        salary=sale*rate/100;
        return (int) salary+temp;
    }

}
