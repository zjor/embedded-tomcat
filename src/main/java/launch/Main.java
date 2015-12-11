package launch;

import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(7001);

        tomcat.addWebapp("/", (new File(webappDirLocation).getAbsolutePath()));

        tomcat.start();
        tomcat.getServer().await();
    }
}