package com.smockin.mockserver.service.dto;

import com.smockin.admin.persistence.enums.RestMethodEnum;

/**
 * Created by gallina.
 */
public class HttpProxiedDTO {

    private String path;
    private RestMethodEnum method;
    private int httpStatusCode;
    private String responseContentType;
    private String body;

    public HttpProxiedDTO() {
    }

    public HttpProxiedDTO(String path, RestMethodEnum method, int httpStatusCode, String responseContentType, String body) {
        this.path = path;
        this.method = method;
        this.httpStatusCode = httpStatusCode;
        this.responseContentType = responseContentType;
        this.body = body;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public RestMethodEnum getMethod() {
        return method;
    }
    public void setMethod(RestMethodEnum method) {
        this.method = method;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getResponseContentType() {
        return responseContentType;
    }
    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

}
