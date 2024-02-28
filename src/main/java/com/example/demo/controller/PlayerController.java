package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    PlayerService playerService;
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping("/playerById/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.getPlayer(id);
    }
    @GetMapping("/playerByName/{name}")
    public Player getPlayerByName(@PathVariable String name) {
        return playerService.getPlayerByName(name);
    }
    @GetMapping("/playerByLastName/{lastName}")
    public Player getPlayerByLastName(@PathVariable String lastName) {
        return playerService.getPlayerByLastName(lastName);
    }
    @GetMapping("/playerWithMaxSpeed")
    public List<Player> getFastestPlayers() {
        return playerService.getFastestPlayers();
    }

    @GetMapping("/playerWithLeftFoot")
    public List<Player> getPlayersWithLeftFoot() {
        return playerService.getLeftPlayers();
    }

    @GetMapping("/playerWithMaxPotential")
    public List<Player> getPlayersWithMaxPotential() {
        return playerService.getPlayersWithMaxPotential();
    }

    //Aktualizacja parametrów zawodnika
    @PutMapping("/players/{id}")
    public Player updatePlayer(@PathVariable Long id,@RequestBody Player player) {
        playerService.updatePlayer(player);
        return player;
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }

    @GetMapping("/findAllPlayers")
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @PostMapping("/createPlayer")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    /*
    @PatchMapping("/partialUpdatePlayers/{id}")
    public Player partialUpdatePlayer(@PathVariable Long id, @RequestBody Player player) {
        return playerService.partialUpdate(id, player);
    }
     */

}
