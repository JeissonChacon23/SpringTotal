package com.example.springtotal.controllers;

import com.example.springtotal.entities.Carro;
import com.example.springtotal.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    CarroRepository carroRepository;

    @GetMapping
    public List<Carro> getCarroAll(){
        List<Carro> carros = carroRepository.findAll();
        return carros;
    }
    @GetMapping("/{placa}")
    public Carro gerCarro(@PathVariable String placa){
        Optional<Carro> carro = carroRepository.findById(placa);
        if(carro.isEmpty()){
            return null;
        }
        return carro.get();
    }
    @PostMapping
    public Carro create(@RequestBody Carro carro){
        carroRepository.save(carro);
        return carro;
    }
    @PutMapping
    public Carro putCarroById(@PathVariable String placa, @RequestBody Carro carro){
        Optional<Carro> carroCurrent = carroRepository.findById(placa);
        if(carroCurrent.isPresent()){
            Carro carroReturn = carroCurrent.get();
            carroReturn.setCilindraje(carro.getCilindraje());
            carroReturn.setColor(carro.getColor());
            carroReturn.setMarca(carro.getMarca());
            carroReturn.setModelo(carro.getModelo());

            carroRepository.save(carroReturn);
            return carroReturn;
        }
        return null;
    }
    @DeleteMapping("/{placa}")
    public Carro deleteCarroById(@PathVariable String placa){
        Optional<Carro> carro = carroRepository.findById(placa);
        if(carro.isPresent()){
            Carro carroReturn = carro.get();
            carroRepository.deleteById(placa);
            return carroReturn;
        }
        return null;
    }
}