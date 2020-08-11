package com.me.sbapp.swaggerspringboot.models;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import java.util.Objects;

@ApiModel(value = "This is Contact domain Model",
description = "will hold contact information of a person")
public  class Contact {
    @ApiModelProperty(value = "unique Id of the model",
    required = true, dataType = "String")
    private String id;
    @ApiModelProperty(value = "name of the person")
    private  String name;
    @ApiModelProperty(value = "contact Phone number of the person")
    private String phone;

    public Contact() {
    }

    public Contact(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public  String  getId() {


        

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return id.equals(contact.id) &&
                name.equals(contact.name) &&
                phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
