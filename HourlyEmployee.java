package employ;
//创建第二种员工的类
public class HourlyEmployee extends Employee {
    private int time;       //定义工作的时间数
    private int time_money=80;  //定义每小时工资
    private int month;       //定义员工的生日月份

    public void setmonth(int month){
        this.month=month;
    }
    public void settime(int time){
        this.time=time;
    }
    //重写方法
    @Override
    public int getSalary(int month){
        int temp=0;   //用于接收是否有生日奖金
        if(getmounth()==month) {
            temp = 100;  //员工当前月份生日，奖励100元,否则为0
        }
        double salary=0;
        if (time<=160)
            salary=time*time_money;
        else
            salary=(time-160)*1.5*time_money+160*time_money;

        return (int) salary+temp;
    }

}
