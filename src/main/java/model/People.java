package model;

import lombok.*;

@Data
@Builder
public class People {
    String name;
    int age;
    boolean gender;
}
