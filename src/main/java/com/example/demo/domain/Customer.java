package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试类
 *
 * @author 庞建华 pangjianhua@winchan.nel.net
 * @createOn 2017-08-04 14:33
 **/
public class Customer implements Serializable {
    private static final long serialVersionUID = 3855155163814518562L;

    private Integer id;//主键
    private String userName;//用户名
    private String password;
    private Date birthday;
    private String name;//姓名
    private String userIcon;//头像地址路径
    private String sex;//性别 1男2女3保密
    private String nickname;//昵称
    private String status;//用户状态 是否冻结01正常02冻结
    private String userMall;
    private Date lastLoginDate;//最后登录时间
    private String lastLoginIp;//最后登录IP
    private String srcOpenUserId;
    private String email;
    private String mobile;
    private boolean deleted;//是否删除，默认为未删除
    private boolean emailConfirmed;//是否绑定邮箱
    private boolean phoneConfirmed;//是否绑定手机
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private String pwdIntensity;//密码强度
    private String mobileTgc;
    private String mac;
    private String source;//1:WEB,2:iOS,3:Android,4:WIFI,5:管理系统, 0:未知
    private String activate;
    private String activateType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserMall() {
        return userMall;
    }

    public void setUserMall(String userMall) {
        this.userMall = userMall;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getSrcOpenUserId() {
        return srcOpenUserId;
    }

    public void setSrcOpenUserId(String srcOpenUserId) {
        this.srcOpenUserId = srcOpenUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public boolean isPhoneConfirmed() {
        return phoneConfirmed;
    }

    public void setPhoneConfirmed(boolean phoneConfirmed) {
        this.phoneConfirmed = phoneConfirmed;
    }


    public String getPwdIntensity() {
        return pwdIntensity;
    }

    public void setPwdIntensity(String pwdIntensity) {
        this.pwdIntensity = pwdIntensity;
    }

    public String getMobileTgc() {
        return mobileTgc;
    }

    public void setMobileTgc(String mobileTgc) {
        this.mobileTgc = mobileTgc;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getActivate() {
        return activate;
    }

    public void setActivate(String activate) {
        this.activate = activate;
    }

    public String getActivateType() {
        return activateType;
    }

    public void setActivateType(String activateType) {
        this.activateType = activateType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
