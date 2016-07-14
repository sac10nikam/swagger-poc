package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;
    private Error error;
    private String statusCode;
    private String statusText;

    public T getData() {
        return this.data;
    }

    @JsonProperty("_error")
    public Error getError() {
        return this.error;
    }

    @JsonProperty("_statusCode")
    public String getStatusCode() {
        return this.statusCode;
    }

    @JsonProperty("_statusText")
    public String getStatusText() {
        return this.statusText;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}