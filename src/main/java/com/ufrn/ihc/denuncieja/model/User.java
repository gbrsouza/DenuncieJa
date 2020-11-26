package com.ufrn.ihc.denuncieja.model;


import com.ufrn.ihc.denuncieja.util.Rule;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    private Long id;

    @Column(nullable = false)
    private Rule rule;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;

    private String phone;

    @Embedded
    private Address address;


}
