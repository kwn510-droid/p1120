package com.example.p1120;

import org.springframework.stereotype.Component;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Component
public class BootListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
         log.debug("부팅시 BootListener 동작");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
