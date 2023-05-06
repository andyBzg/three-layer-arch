package org.crazymages.threelayerarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
//@ComponentScan(basePackages = "org.crazymages.threelayerarch")
@ImportResource("classpath:config.xml")
public class ThreeLayerArchApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ThreeLayerArchApplication.class, args);

        ChequeService chequeServiceFromXML = applicationContext.getBean(ChequeService.class);
        System.out.println(chequeServiceFromXML);

        ChequeService chequeServiceWithBeanAnnotation = applicationContext.getBean("WithBeanAnnotation", ChequeService.class);
        System.out.println(chequeServiceWithBeanAnnotation);

        ChequeService chequeService = (ChequeService) applicationContext.getBean("WithServiceAnnotation");
        System.out.println(chequeService);

    }
}
