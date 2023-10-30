package com.david.spring.iocContainers;

import com.david.spring.helloDavid.HelloDavid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApplicationContextContainerApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\Office\\CodeRepositories-David\\DavidRepos\\SpringDemos\\SpringDemo\\src\\main\\resources\\Beans.xml");
        HelloDavid helloDavid = (HelloDavid) applicationContext.getBean("helloDavid");
        helloDavid.getMessage();
    }
}
