package com.haomostudio.SpringMVCTemplate.service.common;

/**
 *
 * 保存各系统之间的TOKEN的JAVA BEAN
 *
 * Created by steven on 2016/1/6.
 */
public class Token {


    private String Id;

    private String USERBANE;

    private String LOGINID;

    private String PASSWORD;

    private String MOBILE;

    private String EMAIL;

    private String AVATAR;

    private String CREATE_TIME;

    private String LAST_UPDATE_TIME;

    private String LAST_LOGIN_TIME;

    private String SECURITY_LEVEL;

    private String TYPE;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUSERBANE() {
        return USERBANE;
    }

    public void setUSERBANE(String USERBANE) {
        this.USERBANE = USERBANE;
    }

    public String getLOGINID() {
        return LOGINID;
    }

    public void setLOGINID(String LOGINID) {
        this.LOGINID = LOGINID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(String AVATAR) {
        this.AVATAR = AVATAR;
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getLAST_UPDATE_TIME() {
        return LAST_UPDATE_TIME;
    }

    public void setLAST_UPDATE_TIME(String LAST_UPDATE_TIME) {
        this.LAST_UPDATE_TIME = LAST_UPDATE_TIME;
    }

    public String getLAST_LOGIN_TIME() {
        return LAST_LOGIN_TIME;
    }

    public void setLAST_LOGIN_TIME(String LAST_LOGIN_TIME) {
        this.LAST_LOGIN_TIME = LAST_LOGIN_TIME;
    }

    public String getSECURITY_LEVEL() {
        return SECURITY_LEVEL;
    }

    public void setSECURITY_LEVEL(String SECURITY_LEVEL) {
        this.SECURITY_LEVEL = SECURITY_LEVEL;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
}
