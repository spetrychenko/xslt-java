package ua.javatar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Journal")
public class Journal {
    @XmlElement(name = "Student")
    private List<Student> students;
}


