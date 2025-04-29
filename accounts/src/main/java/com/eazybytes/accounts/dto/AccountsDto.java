package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto  {

    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    @NotEmpty(message = "account number should not be empty")
    @Pattern(regexp = "[0-9]{10}" ,message = "account number should be 10 digits")
    private Long accountNumber;


    @Schema(
            description = "Account type of Eazy Bank account", example = "Savings"
    )
    @NotEmpty(message = "account type should not be empty")
    private String accountType;



    @Schema(
            description = "Eazy Bank branch address", example = "123 NewYork"
    )
    @NotEmpty(message = "branch address should not be empty")
    private String branchAddress;
}
