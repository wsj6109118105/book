package user;

/**
 * @className: User
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:37
 * @version: 1.0
 **/
public class User {
    private Integer id;
    private String username;
    private String pasword;
    private String email;

    public User() {
    }

    public User(Integer id, String username, String pasword, String email) {
        this.id = id;
        this.username = username;
        this.pasword = pasword;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + pasword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
