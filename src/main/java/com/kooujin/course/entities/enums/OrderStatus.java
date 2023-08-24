package com.kooujin.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID_SHIPPED(2),
    DELIVERED(3),
    CANCELED(4);

    private final int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid order status code");
    }
}
