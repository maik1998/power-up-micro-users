package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_person")
    private PersonEntity personEntity;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleEntity roleEntity;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "celular")
    private String celular;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "correo")
    private String correo;

    @Column(name = "clave")
    private String clave;

    //Terminar las clases relacionadas con la entidad

}
