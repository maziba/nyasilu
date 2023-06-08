package com.example.kitonga.entity;

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
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    @Column(name = "clientID")
    String clientID;
    @Column(name = "clientName")
    String clientName;
    @Column(name = "email")
    String email;
    @Column(name = "clientAddress")
    String clientAddress;
    @Column(name = "contacts")
    String contacts;
}
