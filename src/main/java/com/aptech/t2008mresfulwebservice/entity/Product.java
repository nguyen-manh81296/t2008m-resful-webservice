package com.aptech.t2008mresfulwebservice.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private double price;
}
