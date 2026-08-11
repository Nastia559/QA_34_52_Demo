package dto;

import enums.Gender;
import enums.Hobbies;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBirth;
    private String subjects;
    private List<Hobbies> hobbies;
    private String picture;
    private String address;
    private String state;
    private String city;
}
