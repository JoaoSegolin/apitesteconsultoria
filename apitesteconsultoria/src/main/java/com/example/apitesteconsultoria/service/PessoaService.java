package com.example.apitesteconsultoria.service;

import com.example.apitesteconsultoria.model.Pessoa;
import com.example.apitesteconsultoria.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) { this.pessoaRepository = pessoaRepository; }

    public Optional<Pessoa> cadastraPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return pessoaRepository.findById(pessoa.getId());
    }

    public Optional<Pessoa> alteraPessoa(int id, Pessoa pessoa) {
        Optional<Pessoa> pessoaTemp = pessoaRepository.findById(id);
        pessoaTemp.get().setNome(pessoa.getNome());
        pessoaTemp.get().setDepartamento(pessoa.getDepartamento());
        pessoaTemp.get().setId_tarefa(pessoa.getId_tarefa());

        pessoaRepository.save(pessoaTemp.get());
        return pessoaTemp;
    }

    public String removePessoa(int id) {
        pessoaRepository.delete(pessoaRepository.findById(id).get());
        return "Pessoa removida";
    }

}
