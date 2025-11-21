package com.example.api.controller;

import com.example.api.medico.DadosListagemMedico;
import com.example.api.medico.DadosMedicos;
import com.example.api.medico.Medico;
import com.example.api.medico.MedicoRepository;
import com.sun.jdi.InterfaceType;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public DadosMedicos test(@RequestBody @Valid DadosMedicos map) {
        repository.save(new  Medico(map));
        return map;
    }

    @GetMapping
    public List<DadosListagemMedico> listMap (){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
