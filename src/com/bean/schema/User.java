package com.bean.schema;

import java.util.Date;

public class User {
    /** 用户ID */
    private Integer userId;
    /** 用户姓名 */
    private String userName;
    /** 账号 */
    private String account;
    /** 密码 */
    private String password;
    /** 用户等级:1-普通、2-管理员、3-超级管理员 */
    private Integer userLevel;
    /** 录入时间 */
    private Date makeDate;
    /** 联系电话 */
    private String phoneNo;
    /** 家庭住址 */
    private String address;
    /** 邮箱 */
    private String mail;
    /** 状态:1-正常、0-失效 */
    private Integer userState;
    /** 备注 */
    private String remarks;
    /** 备用字段 */
    private String spareString1;
    /** 备用字段 */
    private String spareString2;
    /** 备用字段 */
    private Integer spareInteger1;
    /** 备用字段 */
    private Integer spareInteger2;
    /** 备用字段 */
    private Double spareDouble1;
    public Integer getUserId() {
        return this.userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getAccount() {
        return this.account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getUserLevel() {
        return this.userLevel;
    }
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }
    public Date getMakeDate() {
        return this.makeDate;
    }
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMail() {
        return this.mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public Integer getUserState() {
        return this.userState;
    }
    public void setUserState(Integer userState) {
        this.userState = userState;
    }
    public String getRemarks() {
        return this.remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getSpareString1() {
        return this.spareString1;
    }
    public void setSpareString1(String spareString1) {
        this.spareString1 = spareString1;
    }
    public String getSpareString2() {
        return this.spareString2;
    }
    public void setSpareString2(String spareString2) {
        this.spareString2 = spareString2;
    }
    public Integer getSpareInteger1() {
        return this.spareInteger1;
    }
    public void setSpareInteger1(Integer spareInteger1) {
        this.spareInteger1 = spareInteger1;
    }
    public Integer getSpareInteger2() {
        return this.spareInteger2;
    }
    public void setSpareInteger2(Integer spareInteger2) {
        this.spareInteger2 = spareInteger2;
    }
    public Double getSpareDouble1() {
        return this.spareDouble1;
    }
    public void setSpareDouble1(Double spareDouble1) {
        this.spareDouble1 = spareDouble1;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", account=" + account + ", password=" + password
                + ", userLevel=" + userLevel + ", makeDate=" + makeDate + ", phoneNo=" + phoneNo + ", address="
                + address + ", mail=" + mail + ", userState=" + userState + ", remarks=" + remarks + ", spareString1="
                + spareString1 + ", spareString2=" + spareString2 + ", spareInteger1=" + spareInteger1
                + ", spareInteger2=" + spareInteger2 + ", spareDouble1=" + spareDouble1 + "]";
    }
    
    
    
    
    
    
}
