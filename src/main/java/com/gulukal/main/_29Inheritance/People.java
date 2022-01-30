package com.gulukal.main._29Inheritance;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class People {

    private String name;
    private String surName;
    private int age;


}
