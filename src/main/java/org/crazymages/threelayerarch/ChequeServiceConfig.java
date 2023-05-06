package org.crazymages.threelayerarch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChequeServiceConfig {

    @Bean("WithBeanAnnotation")
    public ChequeService createChequeService(){
        return new ChequeService();
    }

}
