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
 * Details of paginated response
 */
@ApiModel(description = "Details of paginated response")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class PaginationV3   {
  @JsonProperty("continuation_key")
  private String continuationKey = null;

  public PaginationV3 continuationKey(String continuationKey) {
    this.continuationKey = continuationKey;
    return this;
  }

  /**
   * Resource listing may return a continuationKey if there's more results available. Request may be retried with the continuationKey, but otherwise same parameters, in order to get more results.
   * @return continuationKey
  **/
  @ApiModelProperty(value = "Resource listing may return a continuationKey if there's more results available. Request may be retried with the continuationKey, but otherwise same parameters, in order to get more results.")
  
    public String getContinuationKey() {
    return continuationKey;
  }

  public void setContinuationKey(String continuationKey) {
    this.continuationKey = continuationKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationV3 paginationV3 = (PaginationV3) o;
    return Objects.equals(this.continuationKey, paginationV3.continuationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continuationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationV3 {\n");
    
    sb.append("    continuationKey: ").append(toIndentedString(continuationKey)).append("\n");
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
