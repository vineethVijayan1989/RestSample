package com.example.RestWithDatabase;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

       private final PlayerRepo finalRepo;

        public PlayerController(PlayerRepo finalRepo) {
            this.finalRepo = finalRepo;
        }

        @GetMapping("")
        public List<Player> getPlayer() {
            return finalRepo.findAll();
        }

        @GetMapping("/{id}")
        public Optional<Player> findByid (@PathVariable Long id) {
            return finalRepo.findById(id);
        }

        @PostMapping("")
        public void AddPlayer(@RequestBody Player pm) {
            finalRepo.save(pm);
        }

        @PutMapping("")
        public void updatePlayer (@RequestBody Player pm) {
            finalRepo.save(pm);
        }

        @DeleteMapping("")
        public  void deletePlayer(@RequestBody Player pm) {
            finalRepo.delete(pm);
        }

    }
