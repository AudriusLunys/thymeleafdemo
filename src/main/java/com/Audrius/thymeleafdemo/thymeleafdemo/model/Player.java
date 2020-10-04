package com.Audrius.thymeleafdemo.thymeleafdemo.model;

import lombok.Getter;
import lombok.Setter;

public class Player {
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private int age;
}
