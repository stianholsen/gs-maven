package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Failure;
import io.swagger.model.RequestEcho;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error response body
 */
@ApiModel(description = "Error response body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class ErrorPayload   {
  @JsonProperty("request")
  private RequestEcho request = null;

  @JsonProperty("failures")
  @Valid
  private List<Failure> failures = null;

  public ErrorPayload request(RequestEcho request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RequestEcho getRequest() {
    return request;
  }

  public void setRequest(RequestEcho request) {
    this.request = request;
  }

  public ErrorPayload failures(List<Failure> failures) {
    this.failures = failures;
    return this;
  }

  public ErrorPayload addFailuresItem(Failure failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<Failure>();
    }
    this.failures.add(failuresItem);
    return this;
  }

  /**
   * More details on the occurred error
   * @return failures
  **/
  @ApiModelProperty(value = "More details on the occurred error")
      @Valid
    public List<Failure> getFailures() {
    return failures;
  }

  public void setFailures(List<Failure> failures) {
    this.failures = failures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorPayload errorPayload = (ErrorPayload) o;
    return Objects.equals(this.request, errorPayload.request) &&
        Objects.equals(this.failures, errorPayload.failures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, failures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorPayload {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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
