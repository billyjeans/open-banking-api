package io.betterbanking.openbankingapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadBalance1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class OBReadBalance1   {
  @JsonProperty("Data")
  private OBReadBalance1Data data = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadBalance1 data(OBReadBalance1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBReadBalance1Data getData() {
    return data;
  }

  public void setData(OBReadBalance1Data data) {
    this.data = data;
  }

  public OBReadBalance1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadBalance1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1 obReadBalance1 = (OBReadBalance1) o;
    return Objects.equals(this.data, obReadBalance1.data) &&
        Objects.equals(this.links, obReadBalance1.links) &&
        Objects.equals(this.meta, obReadBalance1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1 {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
