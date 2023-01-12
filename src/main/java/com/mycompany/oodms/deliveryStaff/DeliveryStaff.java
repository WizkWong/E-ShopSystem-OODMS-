package com.mycompany.oodms.deliveryStaff;

import com.mycompany.oodms.user.User;

import java.util.ArrayList;
import java.util.List;

public class DeliveryStaff extends User {
    public static final String FILENAME = "delivery staff";

    private String phoneNo;

    public DeliveryStaff(Long id, String username, String password, Boolean staff, Boolean admin, String phoneNo) {
        super(id, username, password, staff, admin);
        this.phoneNo = phoneNo;
    }

    public DeliveryStaff(List<String> deliveryStaffData) {
        this(
                Long.valueOf(deliveryStaffData.get(0)),
                deliveryStaffData.get(1),
                deliveryStaffData.get(2),
                Boolean.valueOf(deliveryStaffData.get(3)),
                Boolean.valueOf(deliveryStaffData.get(4)),
                deliveryStaffData.get(5)
        );
    }

    public DeliveryStaff() {
        this(null, null,null, null, null, null);
    }

    public List<String> toList() {
        return new ArrayList<>(List.of(
                String.valueOf(this.getId()),
                this.getUsername(),
                this.getPassword(),
                String.valueOf(this.getStaff()),
                String.valueOf(this.getAdmin()),
                String.valueOf(this.getPhoneNo())
                ));
    }


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
