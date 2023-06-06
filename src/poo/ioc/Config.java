package poo.ioc;

public class Config {
    public static void main(String[] args) {
        DaoNoSql dao = new DaoNoSql();
        Service service = new Service(dao);
    }
}
