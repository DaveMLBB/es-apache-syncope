package org.apache.syncope.common.lib.to;

public class Info {

    private Integer responseType;
    private String responseDesc;

    public Info() {
    }

    public Info(Integer responseType, String responseDesc) {
        this.responseType = responseType;
        this.responseDesc = responseDesc;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public Integer getResponseType() {
        return responseType;
    }

    public void setResponseType(Integer responseType) {
        this.responseType = responseType;
    }
}
