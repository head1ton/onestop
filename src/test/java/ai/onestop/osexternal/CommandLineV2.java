package ai.onestop.osexternal;

import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

@Slf4j
public class CommandLineV2 {

    // program arguments --url=devdb --url=devdb2 --username=dev_user --password=dev_pw mode=on
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg: {}", arg);
        }

        ApplicationArguments arguments = new DefaultApplicationArguments(args);
        log.info("arguments: {}", List.of(arguments.getSourceArgs()));
        log.info("NonOptionsArgs = {}", arguments.getNonOptionArgs());
        log.info("OptionsName = {}", arguments.getOptionNames());

        Set<String> optionNames = arguments.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option arg {} = {}", optionName, arguments.getOptionValues(optionName));
        }

        List<String> url = arguments.getOptionValues("url");
        List<String> username = arguments.getOptionValues("username");
        List<String> password = arguments.getOptionValues("password");
        List<String> mode = arguments.getOptionValues("mode");
        log.info("url: {}", url);
        log.info("username: {}", username);
        log.info("password: {}", password);
        log.info("mode: {}", mode);     // 통문자는 이렇게 못 빼지.
    }
}
