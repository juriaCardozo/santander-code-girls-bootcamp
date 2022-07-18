package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Mentoria {

    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXP();
}
