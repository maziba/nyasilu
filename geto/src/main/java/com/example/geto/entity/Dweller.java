package com.example.geto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dwellerINFO")
public class Dweller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    @Column(name = "dwellerID")
    String dwellerID;
    @Column(name = "dwellerName")
    String dwellerName;
    @Column(name = "contact")
    String contact;
    @Column(name = "payment")
    String payment;
    @Column(name = "roomNo")
    String roomNo;
}
