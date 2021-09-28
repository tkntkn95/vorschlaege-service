package de.hsos.masterarbeit.vorschlaege.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@ToString
@Getter
@Setter
public class Article {

    @Id
    private String id;

    private String name;

    private BigDecimal price;

    public Article() {

    }

    public Article(String id) {
        this.id = id;
    }

    public Article(String id, String name, BigDecimal price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }




}
