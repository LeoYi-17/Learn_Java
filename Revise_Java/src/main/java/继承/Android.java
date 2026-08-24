package 继承;

public class Android extends Employee{
    public Android() {
    }

    public Android(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为"+getId()+"的"+getName()+"员工，正在研发电商的手机客户端软件");
    }
}
