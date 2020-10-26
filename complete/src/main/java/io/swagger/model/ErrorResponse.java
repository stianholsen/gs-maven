package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorPayload;
import io.swagger.model.ResponseHeader;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error response
 */
@ApiModel(description = "Error response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class ErrorResponse   {
  @JsonProperty("group_header")
  private ResponseHeader groupHeader = null;

  @JsonProperty("error")
  private ErrorPayload error = null;

  public ErrorResponse groupHeader(ResponseHeader groupHeader) {
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

  public ErrorResponse error(ErrorPayload error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ErrorPayload getError() {
    return error;
  }

  public void setError(ErrorPayload error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.groupHeader, errorResponse.groupHeader) &&
        Objects.equals(this.error, errorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupHeader, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    groupHeader: ").append(toIndentedString(groupHeader)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
