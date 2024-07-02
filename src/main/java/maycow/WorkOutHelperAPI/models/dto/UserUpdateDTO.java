package maycow.WorkOutHelperAPI.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserUpdateDTO {

    private String id;

    @NotBlank
    @Size(min = 8, max = 60)
    private String password;

}