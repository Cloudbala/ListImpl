package com.example.demo;

/**
 * Created by openc on 28/5/2017.
 */
public class Order {

    Integer orderNo=0;
    String orderType=null;
    Long orderValue=0L;

    Order(Integer orderNo, String orderType, Long orderValue){
        this.orderNo=orderNo;
        this.orderType=orderType;
        this.orderValue=orderValue;
    }

    public Integer getOrderNo(){
        return orderNo;    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Long getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Long orderValue) {
        this.orderValue = orderValue;
    }
}
