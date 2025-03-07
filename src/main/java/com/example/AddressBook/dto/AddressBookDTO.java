package com.example.AddressBook.dto;

import lombok.*;

@Data
@NoArgsConstructor

public class AddressBookDTO {
    private String name;
    private String phone;
    private String email;

    public AddressBookDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}