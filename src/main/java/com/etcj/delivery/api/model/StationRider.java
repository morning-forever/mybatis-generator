package com.etcj.delivery.api.model;

import java.util.Date;

public class StationRider {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.station_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private String stationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.rider_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private String riderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.create_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.create_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.update_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.update_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column station_rider.is_valid
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    private Boolean valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.id
     *
     * @return the value of station_rider.id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.id
     *
     * @param id the value for station_rider.id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.station_id
     *
     * @return the value of station_rider.station_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.station_id
     *
     * @param stationId the value for station_rider.station_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.rider_id
     *
     * @return the value of station_rider.rider_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public String getRiderId() {
        return riderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.rider_id
     *
     * @param riderId the value for station_rider.rider_id
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setRiderId(String riderId) {
        this.riderId = riderId == null ? null : riderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.create_user
     *
     * @return the value of station_rider.create_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.create_user
     *
     * @param createUser the value for station_rider.create_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.create_time
     *
     * @return the value of station_rider.create_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.create_time
     *
     * @param createTime the value for station_rider.create_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.update_user
     *
     * @return the value of station_rider.update_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.update_user
     *
     * @param updateUser the value for station_rider.update_user
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.update_time
     *
     * @return the value of station_rider.update_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.update_time
     *
     * @param updateTime the value for station_rider.update_time
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column station_rider.is_valid
     *
     * @return the value of station_rider.is_valid
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column station_rider.is_valid
     *
     * @param valid the value for station_rider.is_valid
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}