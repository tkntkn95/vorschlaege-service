package de.hsos.masterarbeit.vorschlaege.domain;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
