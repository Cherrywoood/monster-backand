package ru.itmo.monsters.dto;

import lombok.Data;
import ru.itmo.monsters.model.InfectedThing;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Data
public class InfectionDTO {

    private UUID id;
    /*
    //TODO: доделать, когда появится MonsterDTO
    private MonsterDTO monster;
    */
    private InfectedThingDTO infectedThing;
    private Date infectionDate;
    private Date cureDate;
}