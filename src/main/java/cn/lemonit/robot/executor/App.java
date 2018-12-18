package cn.lemonit.robot.executor;
import org.apache.commons.io.IOUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.net.URL;

public class App {

    private static final String ENTRANCE = "/scripts/main.groovy";

    public static void main(String[] args) {
        URL entranceUrl = App.class.getResource(ENTRANCE);
        try {
            String result = IOUtils.toString(entranceUrl, "utf-8");
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName("groovy");
            engine.eval(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
