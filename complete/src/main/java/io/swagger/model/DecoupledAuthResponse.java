package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecoupledAuthResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class DecoupledAuthResponse   {
  @JsonProperty("_links")
  @Valid
  private List<Link> _links = null;

  @JsonProperty("order_ref")
  private String orderRef = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tpp_token")
  private String tppToken = null;

  public DecoupledAuthResponse _links(List<Link> _links) {
    this._links = _links;
    return this;
  }

  public DecoupledAuthResponse addLinksItem(Link _linksItem) {
    if (this._links == null) {
      this._links = new ArrayList<Link>();
    }
    this._links.add(_linksItem);
    return this;
  }

  /**
   * Get _links
   * @return _links
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Link> getLinks() {
    return _links;
  }

  public void setLinks(List<Link> _links) {
    this._links = _links;
  }

  public DecoupledAuthResponse orderRef(String orderRef) {
    this.orderRef = orderRef;
    return this;
  }

  /**
   * Get orderRef
   * @return orderRef
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getOrderRef() {
    return orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public DecoupledAuthResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DecoupledAuthResponse tppToken(String tppToken) {
    this.tppToken = tppToken;
    return this;
  }

  /**
   * Get tppToken
   * @return tppToken
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTppToken() {
    return tppToken;
  }

  public void setTppToken(String tppToken) {
    this.tppToken = tppToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecoupledAuthResponse decoupledAuthResponse = (DecoupledAuthResponse) o;
    return Objects.equals(this._links, decoupledAuthResponse._links) &&
        Objects.equals(this.orderRef, decoupledAuthResponse.orderRef) &&
        Objects.equals(this.status, decoupledAuthResponse.status) &&
        Objects.equals(this.tppToken, decoupledAuthResponse.tppToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, orderRef, status, tppToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecoupledAuthResponse {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tppToken: ").append(toIndentedString(tppToken)).append("\n");
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
