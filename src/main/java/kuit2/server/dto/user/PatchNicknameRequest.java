package kuit2.server.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchNicknameRequest {

    @NotNull(message = "userName: {NotNull}")
    private String userName;

}