package wooteco.chess.util;

import static spark.Spark.*;

import spark.Request;
import spark.Response;

public class RoutesConfig {

    public static void configure() {
        port(8080);
        staticFiles.location("/public");
    }

    public static void setJsonContentType(Request request, Response response) {
        response.type("application/json");
    }
}
