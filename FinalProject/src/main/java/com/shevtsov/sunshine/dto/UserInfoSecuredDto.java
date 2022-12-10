package com.shevtsov.sunshine.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shevtsov.sunshine.common.GenderType;
import com.shevtsov.sunshine.common.TimeFormatPatterns;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserInfoSecuredDto extends UserInfoShortDto {
    protected String firstName;
    protected String lastName;

    @DateTimeFormat(pattern = "dd.mm.yyyy")
    protected Date dateOfBirth;
    protected String city;
    protected Boolean openProfile;

    public UserInfoSecuredDto(Long id, String username, String email, String firstName, String lastName, GenderType genderType, Date dateOfBirth, String city, Boolean openProfile) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderType = genderType;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.openProfile = openProfile;
    }
}
