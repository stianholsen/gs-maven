package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BearerToken;
import io.swagger.model.ResponseHeader;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccessTokenResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class AccessTokenResponse   {
  @JsonProperty("group_header")
  private ResponseHeader groupHeader = null;

  @JsonProperty("response")
  private BearerToken response = null;

  public AccessTokenResponse groupHeader(ResponseHeader groupHeader) {
    this.groupHeader = groupHeader;
    return this;
  }

  /**
   * Get groupHeader
   * @return groupHeader
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ResponseHeader getGroupHeader() {
    return groupHeader;
  }

  public void setGroupHeader(ResponseHeader groupHeader) {
    this.groupHeader = groupHeader;
  }

  public AccessTokenResponse response(BearerToken response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BearerToken getResponse() {
    return response;
  }

  public void setResponse(BearerToken response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
    return Objects.equals(this.groupHeader, accessTokenResponse.groupHeader) &&
        Objects.equals(this.response, accessTokenResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupHeader, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");
    
    sb.append("    groupHeader: ").append(toIndentedString(groupHeader)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
