package com.AllenZhang.entity;

public class UserCart {
    private Integer cartId;

    private Integer userId;

    private Integer goodsId;

    private Integer num;

    private String iscommit;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getIscommit() {
        return iscommit;
    }

    public void setIscommit(String iscommit) {
        this.iscommit = iscommit == null ? null : iscommit.trim();
    }
}