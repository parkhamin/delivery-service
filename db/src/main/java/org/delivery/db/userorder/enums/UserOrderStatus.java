package org.delivery.db.userorder.enums;

public enum UserOrderStatus {
    REGISTERED("등록"),
    UNREGISTERED("해지"),
    ;
    UserOrderStatus(String description){
        this.description = description;
    }
    private String description;
}
