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

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public String[] rainbow = {ANSI_BLUE, ANSI_GREEN, ANSI_RED, ANSI_YELLOW, ANSI_PURPLE, ANSI_CYAN};
    public static void main(final String[] args) {
        final String pack = "org.example.resource";
        String url = "http://localhost:8080/rest";
        System.out.println(ANSI_RED + " __          __  _                            _                                        \n" +
                " \\ \\        / / | |                          | |                                       \n" +
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___                                  \n" +
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\                                 \n" +
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |                                \n" +
                "  ___\\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|_ \\__\\___/                                 \n" +
                " |  __ \\    (_)        / ____|     | |     | | (_)                                     \n" +
                " | |__) |_ _ _ _ __   | (___   ___ | |_   _| |_ _  ___  _ __  ___                      \n" +
                " |  ___/ _` | | '_ \\   \\___ \\ / _ \\| | | | | __| |/ _ \\| '_ \\/ __|                     \n" +
                " | |  | (_| | | | | |  ____) | (_) | | |_| | |_| | (_) | | | \\__ \\                     \n" +
                " |_|   \\__,_|_|_| |_| |_____/ \\___/|_|\\__,_|\\__|_|\\___/|_| |_|___/                     \n" +
                "  _____ _______   _____ _   _  _____ _    _ _   _______ _____ _   _  _____             \n" +
                " |_   _|__   __| |_   _| \\ | |/ ____| |  | | | |__   __|_   _| \\ | |/ ____|            \n" +
                "   | |    | |      | | |  \\| | (___ | |  | | |    | |    | | |  \\| | |  __             \n" +
                "   | |    | |      | | | . ` |\\___ \\| |  | | |    | |    | | | . ` | | |_ |            \n" +
                "  _| |_   | |     _| |_| |\\  |____) | |__| | |____| |   _| |_| |\\  | |__| |  _   _   _ \n" +
                " |_____|  |_|    |_____|_| \\_|_____/ \\____/|______|_|  |_____|_| \\_|\\_____| (_) (_) (_)\n" +
                "                                                                                       \n" +
                "                                                                                       " );
        System.out.println(ANSI_BLACK + "BEI UNS WIRD kundenservice KLEIN GESCHRIEBEN!");
        System.out.println(url);
        final ResourceConfig rc = new ResourceConfig().packages(pack);
        final HttpServer server = JdkHttpServerFactory.createHttpServer(
                URI.create(url), rc);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/rest");
        Invocation.Builder builder = target.path("employees").path("xmlEmp").request(MediaType.
                TEXT_PLAIN);
        Response response = builder.get();
        System.out.println( response.readEntity( String.class));

        System.out.println(ANSI_BLUE + "R" + ANSI_GREEN + "e" + ANSI_RED + "a" + ANSI_YELLOW + "d" + ANSI_PURPLE + "y " + ANSI_CYAN + "f" + ANSI_BLUE + "o" + ANSI_GREEN + "r " + ANSI_RED + "R" + ANSI_YELLOW + "e" + ANSI_PURPLE + "q" + ANSI_CYAN + "u" + ANSI_BLUE + "e" + ANSI_GREEN + "s" + ANSI_RED + "t" + ANSI_YELLOW + "s" + ANSI_PURPLE + "." + ANSI_CYAN + "." + ANSI_BLUE + ".");
    }


}
