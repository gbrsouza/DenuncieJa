package com.ufrn.ihc.denuncieja.model;

import com.ufrn.ihc.denuncieja.util.StatusEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Lob
    private String description;
    private String date;

    private StatusEnum status = StatusEnum.ABERTO;
}
