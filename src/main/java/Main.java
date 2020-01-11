import javax.security.auth.login.LoginException;

import config.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

/**
 * main method
 */
public class Main {

  public static void main(String[] args) throws LoginException {
    JDA jda = new JDABuilder(Config.get("bot.token")).build();
  }
}

// end of file
