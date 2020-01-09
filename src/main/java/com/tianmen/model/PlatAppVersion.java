package com.tianmen.model;

import java.util.Date;

/**
 * app版本列表
 *
 * @author guochaoyong
 * @date 2020-01-09 15:27:08
 */
public class PlatAppVersion {
    /**
     * ID
     */
    private String id;

    /**
     * app类型
     */
    private String appType;

    /**
     * 版本号
     */
    private String version;

    /**
     * 描述
     */
    private String appDesc;

    /**
     * 是否强制升级(1是，0否)
     */
    private Boolean forceUpdate;

    /**
     * 更新地址
     */
    private String updateContent;

    /**
     * 更新版本号
     */
    private String updateVersion;

    /**
     * 包大小
     */
    private Integer packageSize;

    /**
     * md5值
     */
    private String md5;

    /**
     * app状态
     */
    private String appStatus;

    /**
     * 应用平台
     */
    private String platform;

    /**
     * app编码
     */
    private String appCode;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * app类型
     */
    public String getAppType() {
        return appType;
    }

    /**
     * app类型
     */
    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    /**
     * 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 描述
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * 描述
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    /**
     * 是否强制升级(1是，0否)
     */
    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    /**
     * 是否强制升级(1是，0否)
     */
    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     * 更新地址
     */
    public String getUpdateContent() {
        return updateContent;
    }

    /**
     * 更新地址
     */
    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent == null ? null : updateContent.trim();
    }

    /**
     * 更新版本号
     */
    public String getUpdateVersion() {
        return updateVersion;
    }

    /**
     * 更新版本号
     */
    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion == null ? null : updateVersion.trim();
    }

    /**
     * 包大小
     */
    public Integer getPackageSize() {
        return packageSize;
    }

    /**
     * 包大小
     */
    public void setPackageSize(Integer packageSize) {
        this.packageSize = packageSize;
    }

    /**
     * md5值
     */
    public String getMd5() {
        return md5;
    }

    /**
     * md5值
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * app状态
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * app状态
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus == null ? null : appStatus.trim();
    }

    /**
     * 应用平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 应用平台
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * app编码
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * app编码
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    /**
     * 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}