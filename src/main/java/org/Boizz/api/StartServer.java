package org.Boizz.api;

import com.sun.net.httpserver.HttpServer;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class StartServer {

    public static void main(final String[] args) {
        final String pack = "org.example.resource";
        String url = "http://localhost:8080/rest";
        System.out.println("Start server");
        System.out.println(url);
        final ResourceConfig rc = new ResourceConfig().packages(pack);
        final HttpServer server = JdkHttpServerFactory.createHttpServer(
                URI.create(url), rc);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/rest");
        Invocation.Builder builder = target.path("employees").path("xmlEmp").request(MediaType.
                TEXT_PLAIN);
        Response response = builder.get();
        System.out.println(response.readEntity(String.class));

        System.out.println("Ready for Requests....");
    }
}
