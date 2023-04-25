package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "user_hotel", schema = "travel", catalog = "")
public class UserHotelEntity {
    private String id;
    private String userHotelDescribe;
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
    @Column(name = "user_hotel_describe")
    public String getUserHotelDescribe() {
        return userHotelDescribe;
    }

    public void setUserHotelDescribe(String userHotelDescribe) {
        this.userHotelDescribe = userHotelDescribe;
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

        UserHotelEntity that = (UserHotelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userHotelDescribe != null ? !userHotelDescribe.equals(that.userHotelDescribe) : that.userHotelDescribe != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userHotelDescribe != null ? userHotelDescribe.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
