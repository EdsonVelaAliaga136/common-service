package com.evela.common_service.enums;

import lombok.Getter;

@Getter
public enum Status implements EnumWithCustomValue<Integer>{
    REGISTERED(1,"Registered"),
    MODIFIED(2,"Modified"),
    CONFIRMED(3,"Confirmed"),
    ACTIVE(4,"Active"),
    INACTIVE(5,"Inactive"),
    PENDING(6,"Pending"),
    DELETED(7, "Deleted");


    private final Integer value;
    private final String description;

    Status(Integer value, String description) {
        this.value = value;
        this.description = description;
    }
}
