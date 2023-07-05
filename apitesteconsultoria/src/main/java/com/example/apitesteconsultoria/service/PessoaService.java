package com.example.apitesteconsultoria.service;

import com.example.apitesteconsultoria.model.Pessoa;
import com.example.apitesteconsultoria.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) { this.pessoaRepository = pessoaRepository; }

    public String cadastraPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "Pessoa cadastrada";
    }

    public String alteraPessoa(Pessoa pessoa) {
        Optional<Pessoa> pessoaTemp = pessoaRepository.findById(pessoa.getId());
        pessoaTemp.get().setNome(pessoa.getNome());
        pessoaTemp.get().setDepartamento(pessoa.getDepartamento());
        pessoaTemp.get().setId_tarefa(pessoa.getId_tarefa());

        pessoaRepository.save(pessoaTemp.get());
        return "Pessoal alterada com sucesso";
    }

    public String removePessoa(int id) {
        pessoaRepository.delete(pessoaRepository.findById(id).get());
        return "Pessoa removida";
    }

}
