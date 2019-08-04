package org.example.demo.ticket.bootstrap;

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
@ImportResource("classpath:/bootstrapContext.xml")
public class SpringConfiguration {
}
