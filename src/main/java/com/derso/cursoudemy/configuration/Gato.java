package com.derso.cursoudemy.configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Outro exemplo de anotação customizada
// Injetando um gato
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Autowired
@Qualifier("gato")
public @interface Gato {
}
