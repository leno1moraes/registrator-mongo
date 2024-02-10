package com.registrator.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.registrator.backend.repository.RegistratorRepository;
import com.registrator.backend.entity.Registrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping("/registrator")
public class RegistratorController {
    
    @Autowired
    private RegistratorRepository registratorRepository;

    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public List<Registrator> findAll() {        
        return registratorRepository.findAll();        
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    public Registrator add(@RequestBody Registrator registrator) {
        return registratorRepository.save(registrator);
    }
    
    @RequestMapping(value = "/update", method=RequestMethod.PUT)
    public Registrator update(@RequestBody Registrator registrator) {
        return registratorRepository.save(registrator);
    }
    
    @RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable String id ) {
        registratorRepository.deleteById(id);
        return new ResponseEntity<>("Registro deletado com sucesso", HttpStatus.OK);
    }
    

}
