package org.Boizz.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="t_ablesedaten")
public class Ablesedata {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", unique = true, nullable = false, length = 50)
        private int userID;

        @Column(name = "zaehlerart", length = 50)
        private String zaehlerArt;

        @Column(name = "zaehlernummer", unique = true, nullable = false, length = 50)
        private int zaehlerId;

        @Column(name = "erstellungsdatum")
        private Date date;

        @Column(name = "neueingebaut")
        private boolean isNew;

        @Column(name = "zaehlerstand")
        private int zaehlerStand;

        @Column(name = "kommentar")
        private String comment;

}
