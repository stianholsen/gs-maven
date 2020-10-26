package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pagination;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * External response header
 */
@ApiModel(description = "External response header")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class ResponseHeader   {
  @JsonProperty("http_code")
  private Integer httpCode = null;

  @JsonProperty("message_identification")
  private String messageIdentification = null;

  @JsonProperty("creation_date_time")
  private OffsetDateTime creationDateTime = null;

  @JsonProperty("message_pagination")
  private Pagination messagePagination = null;

  public ResponseHeader httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

  /**
   * HTTP code for response
   * @return httpCode
  **/
  @ApiModelProperty(example = "200", value = "HTTP code for response")
  
    public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public ResponseHeader messageIdentification(String messageIdentification) {
    this.messageIdentification = messageIdentification;
    return this;
  }

  /**
   * Original request id for correlation purposes
   * @return messageIdentification
  **/
  @ApiModelProperty(value = "Original request id for correlation purposes")
  
    public String getMessageIdentification() {
    return messageIdentification;
  }

  public void setMessageIdentification(String messageIdentification) {
    this.messageIdentification = messageIdentification;
  }

  public ResponseHeader creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Response creation time
   * @return creationDateTime
  **/
  @ApiModelProperty(value = "Response creation time")
  
    @Valid
    public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public ResponseHeader messagePagination(Pagination messagePagination) {
    this.messagePagination = messagePagination;
    return this;
  }

  /**
   * Get messagePagination
   * @return messagePagination
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Pagination getMessagePagination() {
    return messagePagination;
  }

  public void setMessagePagination(Pagination messagePagination) {
    this.messagePagination = messagePagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeader responseHeader = (ResponseHeader) o;
    return Objects.equals(this.httpCode, responseHeader.httpCode) &&
        Objects.equals(this.messageIdentification, responseHeader.messageIdentification) &&
        Objects.equals(this.creationDateTime, responseHeader.creationDateTime) &&
        Objects.equals(this.messagePagination, responseHeader.messagePagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpCode, messageIdentification, creationDateTime, messagePagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeader {\n");
    
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    messageIdentification: ").append(toIndentedString(messageIdentification)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    messagePagination: ").append(toIndentedString(messagePagination)).append("\n");
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
