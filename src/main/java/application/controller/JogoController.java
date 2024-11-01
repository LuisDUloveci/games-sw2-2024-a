package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import application.record.JogoDTO;
import application.record.JogoListDTO;
import application.service.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    private JogoService jogoSrv;

    public Iterable<JogoListDTO> list() {
        return jogoSrv.getAllSimple();
    }

    @PostMapping
    public JogoDTO insert(@RequestBody JogoDTO jogo){
        return jogoSrv.add(jogo);
    }
}
