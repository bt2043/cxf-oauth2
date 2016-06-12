package com.ericsson.ecanzho.cxf_oauth2.service;

import com.ericsson.ecanzho.cxf_oauth2.model.AuthClientInfo;
import org.apache.cxf.rs.security.oauth2.client.OAuthClientUtils;
import org.apache.cxf.rs.security.oauth2.common.ClientAccessToken;
import org.apache.cxf.rs.security.oauth2.grants.code.AuthorizationCodeGrant;
import org.apache.cxf.rs.security.oauth2.services.AccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ecanzho on 6/12/2016.
 */
@Service
@Path("/auth")
public class AuthService {

    public String authorize(@QueryParam("client_id") String clientId,
                            @QueryParam("redirect_uri") String redirectUri,
                            @QueryParam("scope") String scope,
                            @QueryParam("state") String state) {
        return null;
    }

    @POST
    @Path("/access_token")
    public String accessToken(@HeaderParam("client_id") String clientId,
                              @HeaderParam("client_secret") String clientSecret,
                              @HeaderParam("code") String code,
                              @HeaderParam("redirect_uri") String redirectUri,
                              @HeaderParam("state") String state) {
        return null;
    }

    @GET
    @Path("/genClientSecret")
    @Produces(MediaType.APPLICATION_JSON)
    public AuthClientInfo genClientSecret(@QueryParam("client_name") String clientName) {
        return new AuthClientInfo(clientName, String.valueOf(clientName.hashCode()), String.valueOf(clientName.hashCode()^2));
    }
}
