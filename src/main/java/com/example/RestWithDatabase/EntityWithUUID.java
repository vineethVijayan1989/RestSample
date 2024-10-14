package com.example.RestWithDatabase;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.UUID;

@MappedSuperclass
public class EntityWithUUID {
    @Id
    @Column(name="player_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long playerId;
}
