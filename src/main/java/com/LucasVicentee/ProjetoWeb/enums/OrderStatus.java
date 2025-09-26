package com.LucasVicentee.ProjetoWeb.enums;


public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) { // Criando um construtor para os tipos ENUMERADOS, assim definindo o valor deles de acordo com as necessidades e para maior facilidade de futuras manutenções
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) throws IllegalAccessException {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatus code");
    }
}
