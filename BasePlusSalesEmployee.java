package employ;
//创建第四种员工的类
public class BasePlusSalesEmployee extends SalesEmployee {
    private int basesalary=3000;  //设置底薪为3000
    private int month;
    public void setmonth(int month){
        this.month=month;
    }
    public int getsalary1(){
        return basesalary+getSalary(month);
    }
}
