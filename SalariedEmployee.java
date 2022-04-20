package employ;
//创建第一种员工的类
public class SalariedEmployee extends Employee {
   private int month;
   private int salary=10000;  //设置基本工资为10000

   public void set_month(int month){  //创建员工的生日月数
       this.month=month;
   }
   @Override
   public int getSalary(int month){
        int temp=0;   //用于接收是否有生日奖金
        if(getmounth()==month) {
            temp = 100;  //员工当前月份生日，奖励100元,否则为0
        }
        return salary+temp;
    }
}
