package com.example.RestWithDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Player extends  EntityWithUUID {
    private String Name;
    private String team;
    private String position;
    private Integer rating;
}
