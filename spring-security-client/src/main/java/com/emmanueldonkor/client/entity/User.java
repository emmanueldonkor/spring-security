package com.emmanueldonkor.client.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="users")
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  @Column(length = 60)
  private String password;
  private String role;
  private Boolean enabled = false;

}
