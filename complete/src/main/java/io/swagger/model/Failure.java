package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Validation error
 */
@ApiModel(description = "Validation error")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class Failure   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("type")
  private String type = null;

  public Failure code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Failure code
   * @return code
  **/
  @ApiModelProperty(value = "Failure code")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Failure description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Failure description
   * @return description
  **/
  @ApiModelProperty(value = "Failure description")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Failure path(String path) {
    this.path = path;
    return this;
  }

  /**
   * JSON path of the failing element if applicable
   * @return path
  **/
  @ApiModelProperty(value = "JSON path of the failing element if applicable")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Failure type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the validation error, e.g. NotNull
   * @return type
  **/
  @ApiModelProperty(value = "Type of the validation error, e.g. NotNull")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Failure failure = (Failure) o;
    return Objects.equals(this.code, failure.code) &&
        Objects.equals(this.description, failure.description) &&
        Objects.equals(this.path, failure.path) &&
        Objects.equals(this.type, failure.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Failure {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
