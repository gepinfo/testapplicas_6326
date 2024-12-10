package com.geppetto.testapplicas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.UUID;


@Entity
@Table(name ="Person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

@Id
private String id;

private String name;

private String Enter_Name;



}