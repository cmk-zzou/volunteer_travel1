package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "attractions", schema = "travel", catalog = "")
public class AttractionsEntity {
    private String id;
    private String image;
    private String attractionsName;
    private String attractionsAddress;
    private String attractionsDescribe;
    private Integer attractionsStatus;
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
    @Column(name = "attractions_name")
    public String getAttractionsName() {
        return attractionsName;
    }

    public void setAttractionsName(String attractionsName) {
        this.attractionsName = attractionsName;
    }

    @Basic
    @Column(name = "attractions_address")
    public String getAttractionsAddress() {
        return attractionsAddress;
    }

    public void setAttractionsAddress(String attractionsAddress) {
        this.attractionsAddress = attractionsAddress;
    }

    @Basic
    @Column(name = "attractions_describe")
    public String getAttractionsDescribe() {
        return attractionsDescribe;
    }

    public void setAttractionsDescribe(String attractionsDescribe) {
        this.attractionsDescribe = attractionsDescribe;
    }

    @Basic
    @Column(name = "attractions_status")
    public Integer getAttractionsStatus() {
        return attractionsStatus;
    }

    public void setAttractionsStatus(Integer attractionsStatus) {
        this.attractionsStatus = attractionsStatus;
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

        AttractionsEntity that = (AttractionsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (attractionsName != null ? !attractionsName.equals(that.attractionsName) : that.attractionsName != null)
            return false;
        if (attractionsAddress != null ? !attractionsAddress.equals(that.attractionsAddress) : that.attractionsAddress != null)
            return false;
        if (attractionsDescribe != null ? !attractionsDescribe.equals(that.attractionsDescribe) : that.attractionsDescribe != null)
            return false;
        if (attractionsStatus != null ? !attractionsStatus.equals(that.attractionsStatus) : that.attractionsStatus != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (attractionsName != null ? attractionsName.hashCode() : 0);
        result = 31 * result + (attractionsAddress != null ? attractionsAddress.hashCode() : 0);
        result = 31 * result + (attractionsDescribe != null ? attractionsDescribe.hashCode() : 0);
        result = 31 * result + (attractionsStatus != null ? attractionsStatus.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
