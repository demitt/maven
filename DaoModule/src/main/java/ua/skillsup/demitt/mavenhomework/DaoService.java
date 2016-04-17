package ua.skillsup.demitt.mavenhomework;

public class DaoService {
    private String address;
    private int port;
    private String login;
    private String password;

    public int getConnection(String address, int port, String login, String password) {
        this.address = address;
        this.port = port;
        this.login = login;
        this.password = password;
        return 1;
    }

}
