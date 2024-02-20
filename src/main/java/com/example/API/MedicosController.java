package com.example.API;

import com.example.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicosController {
@PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico Dados){
    System.out.println(Dados);

    }

}
