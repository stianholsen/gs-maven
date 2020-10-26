package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountPayload;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetsPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class AssetsPayload   {
  @JsonProperty("accounts")
  @Valid
  private List<AccountPayload> accounts = null;

  /**
   * Gets or Sets scopes
   */
  public enum ScopesEnum {
    ACCOUNTS_BASIC("ACCOUNTS_BASIC"),
    
    ACCOUNTS_BALANCES("ACCOUNTS_BALANCES"),
    
    ACCOUNTS_DETAILS("ACCOUNTS_DETAILS"),
    
    ACCOUNTS_TRANSACTIONS("ACCOUNTS_TRANSACTIONS"),
    
    PAYMENTS_MULTIPLE("PAYMENTS_MULTIPLE");

    private String value;

    ScopesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopesEnum fromValue(String text) {
      for (ScopesEnum b : ScopesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("scopes")
  @Valid
  private List<ScopesEnum> scopes = null;

  public AssetsPayload accounts(List<AccountPayload> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AssetsPayload addAccountsItem(AccountPayload accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountPayload>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<AccountPayload> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountPayload> accounts) {
    this.accounts = accounts;
  }

  public AssetsPayload scopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AssetsPayload addScopesItem(ScopesEnum scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<ScopesEnum>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  
    public List<ScopesEnum> getScopes() {
    return scopes;
  }

  public void setScopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsPayload assetsPayload = (AssetsPayload) o;
    return Objects.equals(this.accounts, assetsPayload.accounts) &&
        Objects.equals(this.scopes, assetsPayload.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsPayload {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
