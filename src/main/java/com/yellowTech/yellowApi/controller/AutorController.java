package com.yellowTech.yellowApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yellowTech.yellowApi.dto.AutorDto;
import com.yellowTech.yellowApi.service.AutorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/listarAutores")
    public List<AutorDto> listarAutores() {
        return autorService.listarTodosAutores();
    }

    @PostMapping("/novoAutor")
    public AutorDto criarNovoAutor(@RequestBody AutorDto autorDto) {

        return autorService.criarAutor(autorDto);
    }

    @DeleteMapping("/deleteAutor")
    public void deletar(@PathVariable Long id){

        autorService.deletarAutor(id);

    }

}
