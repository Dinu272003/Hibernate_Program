package org.example.useValidation;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dinesh {
    @Id
    int dineshId;
//    @NotBlank(message = "Please Enter Dinesh Address")
    @NotNull (message = "Please Enter Dinesh Address")
    String address;
    String branch;
}
