package employ;
//创建父类Employee
public class Employee {
 private String name;
 private static int mounth=4;  //用来定义当前的月份为四月
 public int getmounth(){
        return mounth;         //获取当前的月份
    }
 public void set_name(String name){
        this.name=name;         //设置员工的姓名
 }
 public String getname(){
     return name;
 }
 public int getSalary(int month){
     int temp=0;      //用于接收是否有生日奖金
     int salary=0;
     if(this.mounth==month) {
         temp = 100;  //员工当前月份生日，奖励100元,否则为0
     }
     return salary+temp;
 }
}
