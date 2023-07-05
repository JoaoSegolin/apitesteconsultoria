package com.example.apitesteconsultoria.controller;

import com.example.apitesteconsultoria.model.Pessoa;
import com.example.apitesteconsultoria.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/vi/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) { this.pessoaService = pessoaService; }

    @PostMapping
    public ResponseEntity<Optional> cadastraPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<Optional>(pessoaService.cadastraPessoa(pessoa), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional> alteraPessoa(@PathVariable int id, @RequestBody Pessoa pessoa) {
        return new ResponseEntity<Optional>(pessoaService.alteraPessoa(id, pessoa), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removePessoa(@PathVariable int id) {
        return new ResponseEntity<String>(pessoaService.removePessoa(id), HttpStatus.OK);
    }

}
