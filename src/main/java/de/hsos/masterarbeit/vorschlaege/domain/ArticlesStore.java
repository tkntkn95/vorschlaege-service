package de.hsos.masterarbeit.vorschlaege.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ArticlesStore {

    @Autowired
    private ArticleRepository articleRepository;


    public void save(Article article) {
        articleRepository.save(article);
    }

    public Collection<Article> getAll() {
        return articleRepository.findAll();
    }

    public Article get(String id) {
        return articleRepository.findById(id).orElse(null);
    }

    public long getSize() {
        return articleRepository.count();
    }

    public void delete(String key) {
        articleRepository.deleteById(key);
    }

}
