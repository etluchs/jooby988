package com.mycompany;

import com.typesafe.config.Config;
import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "Hello "+ require(Config.class).getString("greeting"));
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
