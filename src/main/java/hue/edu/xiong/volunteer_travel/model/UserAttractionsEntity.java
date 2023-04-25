package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "user_attractions", schema = "travel", catalog = "")
public class UserAttractionsEntity {
    private String id;
    private String userAttractionsDescribe;
    private Timestamp createDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_attractions_describe")
    public String getUserAttractionsDescribe() {
        return userAttractionsDescribe;
    }

    public void setUserAttractionsDescribe(String userAttractionsDescribe) {
        this.userAttractionsDescribe = userAttractionsDescribe;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAttractionsEntity that = (UserAttractionsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userAttractionsDescribe != null ? !userAttractionsDescribe.equals(that.userAttractionsDescribe) : that.userAttractionsDescribe != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userAttractionsDescribe != null ? userAttractionsDescribe.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
