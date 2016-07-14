package model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@ApiModel
@JsonAutoDetect
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "The contact address 1", required = true)
    private String address1;
    @ApiModelProperty(notes = "The contact address 2", required = false)
    private String address2;

    // Getters and setters
    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1
     *            the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2
     *            the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}