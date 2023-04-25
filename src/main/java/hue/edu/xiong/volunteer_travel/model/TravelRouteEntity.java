package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "travel_route", schema = "travel", catalog = "")
public class TravelRouteEntity {
    private String id;
    private String routeName;
    private String routeDescribe;
    private int routeStatus;
    private String routeAddress;
    private int collectNumber;
    private Timestamp createDate;
    private Timestamp updateDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "route_name")
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Basic
    @Column(name = "route_describe")
    public String getRouteDescribe() {
        return routeDescribe;
    }

    public void setRouteDescribe(String routeDescribe) {
        this.routeDescribe = routeDescribe;
    }

    @Basic
    @Column(name = "route_status")
    public int getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(int routeStatus) {
        this.routeStatus = routeStatus;
    }

    @Basic
    @Column(name = "route_address")
    public String getRouteAddress() {
        return routeAddress;
    }

    public void setRouteAddress(String routeAddress) {
        this.routeAddress = routeAddress;
    }

    @Basic
    @Column(name = "collect_number")
    public int getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(int collectNumber) {
        this.collectNumber = collectNumber;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelRouteEntity that = (TravelRouteEntity) o;

        if (routeStatus != that.routeStatus) return false;
        if (collectNumber != that.collectNumber) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (routeName != null ? !routeName.equals(that.routeName) : that.routeName != null) return false;
        if (routeDescribe != null ? !routeDescribe.equals(that.routeDescribe) : that.routeDescribe != null)
            return false;
        if (routeAddress != null ? !routeAddress.equals(that.routeAddress) : that.routeAddress != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (routeName != null ? routeName.hashCode() : 0);
        result = 31 * result + (routeDescribe != null ? routeDescribe.hashCode() : 0);
        result = 31 * result + routeStatus;
        result = 31 * result + (routeAddress != null ? routeAddress.hashCode() : 0);
        result = 31 * result + collectNumber;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }
}
