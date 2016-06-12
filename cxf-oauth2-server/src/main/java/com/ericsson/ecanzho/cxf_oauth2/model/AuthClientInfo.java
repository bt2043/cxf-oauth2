package com.ericsson.ecanzho.cxf_oauth2.model;

import java.io.Serializable;

/**
 * Created by ecanzho on 6/12/2016.
 */
public class AuthClientInfo implements Serializable {
    private String client_name;
    private String client_id;
    private String client_secret;

    public AuthClientInfo() {
        //Ignore
    }

    public AuthClientInfo(String client_name, String client_id, String client_secret) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_secret = client_secret;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
}
