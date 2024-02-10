package com.registrator.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.registrator.backend.repository.RegistratorRepository;

import java.util.List;

import com.registrator.backend.entity.Registrator;

@Component
public class DataInitizr implements ApplicationListener<ContextRefreshedEvent> {
    
    @Autowired
    RegistratorRepository registratorRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event){
        
        List<Registrator> registrator = registratorRepository.findAll();

        if (registrator.isEmpty()){
            createRegistrator("200.199.195.200", "Campus Marte");
        }

    }

    public void createRegistrator(String ip, String local){
        Registrator registrator = new Registrator(ip, local);
        registratorRepository.save(registrator);
    }

}
