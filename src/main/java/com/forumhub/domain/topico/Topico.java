package com.forumhub.domain.topico;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private String status = "NAO_RESPONDIDO";
    private String autor;
    private String curso;

    public void atualizar(String titulo, String mensagem) {
        if (titulo != null) this.titulo = titulo;
        if (mensagem != null) this.mensagem = mensagem;
    }
}