package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "hotel", schema = "travel", catalog = "")
public class HotelEntity {
    private String id;
    private String image;
    private String hotelName;
    private String hotelAddress;
    private String hotelDescribe;
    private Integer hotelStatus;
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
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "hotel_name")
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Basic
    @Column(name = "hotel_address")
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    @Basic
    @Column(name = "hotel_describe")
    public String getHotelDescribe() {
        return hotelDescribe;
    }

    public void setHotelDescribe(String hotelDescribe) {
        this.hotelDescribe = hotelDescribe;
    }

    @Basic
    @Column(name = "hotel_status")
    public Integer getHotelStatus() {
        return hotelStatus;
    }

    public void setHotelStatus(Integer hotelStatus) {
        this.hotelStatus = hotelStatus;
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

        HotelEntity that = (HotelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (hotelName != null ? !hotelName.equals(that.hotelName) : that.hotelName != null) return false;
        if (hotelAddress != null ? !hotelAddress.equals(that.hotelAddress) : that.hotelAddress != null) return false;
        if (hotelDescribe != null ? !hotelDescribe.equals(that.hotelDescribe) : that.hotelDescribe != null)
            return false;
        if (hotelStatus != null ? !hotelStatus.equals(that.hotelStatus) : that.hotelStatus != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (hotelAddress != null ? hotelAddress.hashCode() : 0);
        result = 31 * result + (hotelDescribe != null ? hotelDescribe.hashCode() : 0);
        result = 31 * result + (hotelStatus != null ? hotelStatus.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
