package com.chen.di;

import java.util.Objects;

/**
 * 通过依赖注入的方式初始化对象
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

}
