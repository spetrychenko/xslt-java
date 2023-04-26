package ua.javatar;

import javax.xml.bind.annotation.XmlElement;

public final class Student {
    @XmlElement(name = "FirstName")
    private String firstName;
    @XmlElement(name = "LastName")
    private String lastName;
}