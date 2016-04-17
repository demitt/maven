package ua.skillsup.demitt.mavenhomework;

public class CoreService {

    DaoService dao = new DaoService();
    int connectionId = dao.getConnection("http://my.dbserver.ua", 3306, "uzver", "pass");

}
