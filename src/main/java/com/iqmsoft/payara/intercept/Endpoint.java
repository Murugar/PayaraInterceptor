package com.iqmsoft.payara.intercept;


import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Optional;


@Named
@Path("/test")
public class Endpoint {

    @Inject
    private SomeBean someBean;

    private static final String TEST_PASSED = "Test passed";

    @GET
    public Response test() {
        Optional<String> greet = someBean.greet();
        return Response.ok(TEST_PASSED).build();
    }
}
