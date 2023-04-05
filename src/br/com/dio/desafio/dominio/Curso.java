package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                " Titulo = " + getTitulo() + '\'' +
                ", Descricao = " + getDescricao() + '\'' +
                ", Carga Horaria = " + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria && Objects.equals(getTitulo(), curso.getTitulo()) && Objects.equals(getDescricao(), curso.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao(), cargaHoraria);
    }
}
