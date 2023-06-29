package org.example;

import java.io.IOException;

public class SimpleHttpServer {
    public static void start() {
        try {
            final Process p = Runtime.getRuntime().exec("python -m http.server 80");
            Runtime.getRuntime().addShutdownHook(new Thread(p::destroy));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
