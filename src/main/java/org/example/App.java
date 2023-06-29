package org.example;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        new Thread(SimpleHttpServer::start).start();
        Thread.sleep(2000); // wait till SimpleHttpServer starts successfully
        Yaml yaml = new Yaml();
        File file = new File("PoC1.yaml");
        InputStream inputStream = new FileInputStream(file);
        yaml.load(inputStream);
    }
}
