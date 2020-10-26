package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class Body   {
  @JsonProperty("code")
  private String code = null;

  /**
   * The grant type of request
   */
  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String text) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("grant_type")
  private GrantTypeEnum grantType = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  public Body code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The OAuth2 auth code. Required if grant_type=authorization_code
   * @return code
  **/
  @ApiModelProperty(value = "The OAuth2 auth code. Required if grant_type=authorization_code")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Body grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * The grant type of request
   * @return grantType
  **/
  @ApiModelProperty(required = true, value = "The grant type of request")
      @NotNull

    public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public Body refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The OAuth2 refresh token. Required if grant_type=refresh_token
   * @return refreshToken
  **/
  @ApiModelProperty(value = "The OAuth2 refresh token. Required if grant_type=refresh_token")
  
    public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.code, body.code) &&
        Objects.equals(this.grantType, body.grantType) &&
        Objects.equals(this.refreshToken, body.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
