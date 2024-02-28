package com.example.demo.service;

import com.example.demo.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private List<Player> players = new ArrayList<>();

        public PlayerService() {
            players.add(new Player(
                    "Firstname1", "Lastname1", 25, "Forward",
                    80, 85, 75, 82, 88, 75, 78, 85, 80, 85, 70, 80, 85, 180, 75,
                    "Right", "3", "4", "Poland"
            ));

            players.add(new Player(
                    "Firstname2", "Firstname2", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname3", "Lastname3",28, "Midfielder",
                    85, 81, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname4", "Lastname4",28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname5", "Lastname5",28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname6", "Lastname6",28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname7", "Lastname7",28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname8", "Lastname8", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname9", "Lastname9", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname10", "Lastname10",28, "Midfielder",
                    85, 99, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname11", "Lastname11", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname12", "Lastname12", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname13", "Lastname13",28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));

            players.add(new Player(
                    "Firstname14", "Lastname14", 28, "Midfielder",
                    85, 78, 82, 80, 82, 80, 85, 90, 88, 85, 78, 80, 88, 180, 68,
                    "Left", "4", "5", "Poland"
            ));
        }



        public Player getPlayer(Long id) {
            return players.get(id.intValue() - 1);
        }
        public Player getPlayerByName(String name) {
            for (Player player : players) {
                if (player.getFirstName().equals(name)) {
                    return player;
                }
            }
            return null;
        }
        public Player getPlayerByLastName(String lastName) {
            for (Player player : players) {
                if (player.getLastName().equals(lastName)) {
                    return player;
                }
            }
            return null;
        }

        //Metoda zwracająca zawodników z największą szybkością powiedzmy ze powyzej 80 w skali 1-100
        public List<Player> getFastestPlayers() {
            List<Player> fastestPlayers = new ArrayList<>();
            for (Player player : players) {
                if (player.getMaxSpeed() > 80) {
                    fastestPlayers.add(player);
                }
            }
            return fastestPlayers;
        }

        //Gracze lowonożni
        public List<Player> getLeftPlayers() {
            List<Player> leftPlayers = new ArrayList<>();
            for (Player player : players) {
                if (player.getFoot().equals("Left")) {
                    leftPlayers.add(player);
                }
            }
            return leftPlayers;
        }

        public List<Player> getPlayersWithMaxPotential() {
            List<Player> playersWithMaxPotential = new ArrayList<>();
            for (Player player : players) {
                if (player.getPotential() > 85) {
                    playersWithMaxPotential.add(player);
                }
            }
            return playersWithMaxPotential;
        }



        public List<Player> findAll() {
            return players;
        }

        //aktualizacja parametrów zawodnika
        public void updatePlayer(Player player) {
            Player playerToUpdate = getPlayerByName(player.getFirstName());
            playerToUpdate.setAge(player.getAge());
            playerToUpdate.setFoot(player.getFoot());
            playerToUpdate.setPotential(player.getPotential());
            playerToUpdate.setMaxSpeed(player.getMaxSpeed());
            playerToUpdate.setStamina(player.getStamina());
            playerToUpdate.setWeight(player.getWeight());
            playerToUpdate.setHeight(player.getHeight());

        }
}
