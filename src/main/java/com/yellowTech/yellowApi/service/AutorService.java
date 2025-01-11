package com.yellowTech.yellowApi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yellowTech.yellowApi.dto.AutorDto;
import com.yellowTech.yellowApi.entity.AutorEntity;
import com.yellowTech.yellowApi.repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<AutorDto> listarTodosAutores() {
        return autorRepository.findAll().stream()
                .map(autor -> new AutorDto(autor.getId(), autor.getNome(), autor.getDescricao()))
                .collect(Collectors.toList());
    }


    public AutorDto criarAutor (AutorDto autorDto){
        AutorEntity autor = new AutorEntity();

        autor.setNome(autorDto.getNome());
        autor.setDescricao(autorDto.getDescricao());
        autor = autorRepository.save(autor);

        return new AutorDto(autor.getId(), autor.getNome(), autor.getDescricao());
    }

    public void deletarAutor(Long id){
        autorRepository.deleteById(id);
    }

}
