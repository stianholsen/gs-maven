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
 * Body1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class Body1   {
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

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  public Body1 code(String code) {
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

  public Body1 grantType(GrantTypeEnum grantType) {
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

  public Body1 redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Redirect URI you used when this application was registered with Nordea. Required if grant_type=authorization_code
   * @return redirectUri
  **/
  @ApiModelProperty(value = "Redirect URI you used when this application was registered with Nordea. Required if grant_type=authorization_code")
  
    public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public Body1 refreshToken(String refreshToken) {
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
    Body1 body1 = (Body1) o;
    return Objects.equals(this.code, body1.code) &&
        Objects.equals(this.grantType, body1.grantType) &&
        Objects.equals(this.redirectUri, body1.redirectUri) &&
        Objects.equals(this.refreshToken, body1.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, redirectUri, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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
