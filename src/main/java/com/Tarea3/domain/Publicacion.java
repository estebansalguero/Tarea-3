package com.Tarea3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Pub")
public class Publicacion implements Serializable {
       private static final long serialVersionUID = 1L;
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long idPub;
       private String titulo;
       private String autor;
       private String review;
       private String date;
       
       public Publicacion() {
           
       }

    public Publicacion(Long idPub, String titulo, String autor, String review, String date) {
        this.idPub = idPub;
        this.titulo = titulo;
        this.autor = autor;
        this.review = review;
        this.date = date;
    }
       

}
