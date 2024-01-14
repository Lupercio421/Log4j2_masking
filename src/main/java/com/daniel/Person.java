package com.daniel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer creditCardNumber;
    private String address;

    @Override
    public String toString() {
        System.out.println("***Starting the Person class***");
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", creditCardNumber=" + creditCardNumber +
                ", address='" + address + '\'' +
                '}';
    }
}