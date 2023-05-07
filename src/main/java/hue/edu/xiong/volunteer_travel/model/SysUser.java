package hue.edu.xiong.volunteer_travel.model;


import javax.persistence.*;

@Entity
@Table(name = "sys_user")
public class SysUser {


    @Id
    @Column(name = "ids")
    private String ids;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return ids;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

}
