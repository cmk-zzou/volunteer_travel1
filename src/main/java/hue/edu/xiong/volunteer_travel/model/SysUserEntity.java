package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "sys_user", schema = "travel", catalog = "")
public class SysUserEntity {
    private String ids;
    private String username;
    private String password;

    @Id
    @Column(name = "ids")
    public String getIds() {
        return ids;
    }

    public void setIds(String id) {
        this.ids = ids;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUserEntity that = (SysUserEntity) o;

        if (ids != null ? !ids.equals(that.ids) : that.ids != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ids != null ? ids.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
