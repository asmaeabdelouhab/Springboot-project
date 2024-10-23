package com.ev.pcs.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Module {
    private int id;
    private String nom;
    private String description;
}
