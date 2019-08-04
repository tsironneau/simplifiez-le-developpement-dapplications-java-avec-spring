package org.example.demo.ticket.webapp.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by tsironneau on 04/08/2019.
 * <p>
 * ticket-spring
 */
@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/applicationContext.xml")
public class SpringConfiguration {
}
