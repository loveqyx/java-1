package employ;
/*某公司的雇员分为以下若干类：
        (1) Employee：这是所有员工总的父类。
        ① 属性：员工的姓名,员工的生日月份
        ② 方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会
        额外奖励100 元。

        (2) SalariedEmployee：Employee 的子类，拿固定工资的员工。
        ① 属性：月薪。

        (3)HourlyEmployee：Employee 的子类，按小时拿工资的员工，每月工作超出160小时的部分按照1.5 倍工资发放。
        ① 属性：每小时的工资、每月工作的小时数。

        (4) SalesEmployee：Employee 的子类，销售，工资由月销售额和提成率决定。
        ① 属性：月销售额、提成率。

        (5) BasePlusSalesEmployee：SalesEmployee 的子类，有固定底薪的销售人员，工资由底薪加
        上销售提成部分。
        ① 属性：底薪。

        要求：
        创建一个Employee 数组，分别创建若干不同的Employee对象，并打印某个月的工资。
        注意：要求把每个类都做成完全封装，不允许非私有化属性。
*/
public class Start {
    public static void main(String[] args){
      SalariedEmployee employee1=new SalariedEmployee();//创建第一个员工，类型为SalariedEmployee类型
        int a1=6;    //定义员工的生日月份
        String a2="Zhangsan";  //定义员工的姓名
        employee1.set_month(a1);     //第一个员工生日月份
        employee1.set_name(a2);
        System.out.println(employee1.getname()+"'s salary is "+employee1.getSalary(a1));
        System.out.println(".......................");

      HourlyEmployee employee2=new HourlyEmployee();  //创建第二个员工，类型为HourlyEmployee类型
        int b1=4;  //定义员工的生日月份
        String b2="Lisi";
        int b3=170;  //定义员工的月工作小时数
        employee2.setmonth(b1);
        employee2.set_name(b2);
        employee2.settime(b3);
        System.out.println(employee2.getname()+"'s salary is "+employee2.getSalary(b1));
        System.out.println(".......................");

      SalesEmployee employee3=new SalesEmployee();  //创建第三个员工，类型为SalesEmployee类型
        int c1=8;//定义员工的生日月份
        String c2="Wangwu";//定义员工的名字
        int sale=100000;// 定义员工的销售额
        employee3.setmonth(c1);
        employee3.set_name(c2);
        employee3.setsale(sale);
        System.out.println(employee3.getname()+" 's salary is "+employee3.getSalary(c1));
        System.out.println(".......................");

      BasePlusSalesEmployee employee4=new BasePlusSalesEmployee();
        int d1=11;  // 定义员工的生日月份
        String d2="Huliu";//定义员工的姓名
        int sales=8000;  //定义员工的销售额
        employee4.setmonth(d1);
        employee4.setsale(sales);
        employee4.set_name(d2);
        System.out.println(employee4.getname()+" 's salary is "+employee4.getsalary1());













    }
}
