package com.bean.schema;

import java.util.Date;

public class Customer {
    
    /** 顾客ID */
    private Integer customerId;
    /** 顾客姓名 */
    private String customerName;
    /** 顾客等级:1-5等级又低到高 */
    private Integer customerLevel;
    /** 录入时间 */
    private Date makeDate;
    /** 生日 */
    private Date birthday;
    /** 年龄 */
    private Integer age;
    /** 手机号码 */
    private String phoneNo;
    /** 家庭住址 */
    private String address;
    /** 邮箱 */
    private String mail;
    /** 状态:1-正常、0-失效 */
    private Integer customerState;
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
    
    
    public Integer getCustomerId() {
        return this.customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Integer getCustomerLevel() {
        return this.customerLevel;
    }
    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }
    public Date getMakeDate() {
        return this.makeDate;
    }
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Integer getAge() {
        return this.age;
    }
    public void setAge(Integer age) {
        this.age = age;
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
    public Integer getCustomerState() {
        return this.customerState;
    }
    public void setCustomerState(Integer customerState) {
        this.customerState = customerState;
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

    
    
    
}
