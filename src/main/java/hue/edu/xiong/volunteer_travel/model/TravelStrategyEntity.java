package hue.edu.xiong.volunteer_travel.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by asus on 2023/4/14.
 */
@Entity
@Table(name = "travel_strategy", schema = "travel", catalog = "")
public class TravelStrategyEntity {
    private String id;
    private String strategyDescribe;
    private Integer strategyStatus;
    private Timestamp createDate;
    private String title;
    private String errorMessage;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "strategy_describe")
    public String getStrategyDescribe() {
        return strategyDescribe;
    }

    public void setStrategyDescribe(String strategyDescribe) {
        this.strategyDescribe = strategyDescribe;
    }

    @Basic
    @Column(name = "strategy_status")
    public Integer getStrategyStatus() {
        return strategyStatus;
    }

    public void setStrategyStatus(Integer strategyStatus) {
        this.strategyStatus = strategyStatus;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelStrategyEntity that = (TravelStrategyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (strategyDescribe != null ? !strategyDescribe.equals(that.strategyDescribe) : that.strategyDescribe != null)
            return false;
        if (strategyStatus != null ? !strategyStatus.equals(that.strategyStatus) : that.strategyStatus != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (errorMessage != null ? !errorMessage.equals(that.errorMessage) : that.errorMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (strategyDescribe != null ? strategyDescribe.hashCode() : 0);
        result = 31 * result + (strategyStatus != null ? strategyStatus.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        return result;
    }
}
