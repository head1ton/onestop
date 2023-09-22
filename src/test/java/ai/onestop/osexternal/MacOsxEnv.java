package ai.onestop.osexternal;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacOsxEnv {

    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            log.info("env {} = {}", key, envMap.get(key));
        }
    }
}
