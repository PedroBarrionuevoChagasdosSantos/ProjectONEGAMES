package com.example.projectonegames.Model;

import java.util.Date;

public class Jogos {

    public int classificação;
    public int mediaavaliacoes;
    public int maisbaixados;



    public String nome;
    public String categoria;



    public String titulo;
    public String texto;
    public String autor;
    public Date data;





    public int getMaisbaixados() {
        return maisbaixados;
    }

    public void setMaisbaixados(int maisbaixados) {
        this.maisbaixados = maisbaixados;
    }




    public int getMediaavaliacoes() {
        return mediaavaliacoes;
    }

    public void setMediaavaliacoes(int mediaavaliacoes) {
        this.mediaavaliacoes = mediaavaliacoes;
    }





    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getCategoria() {
        return categoria;
    }

        public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




        public int getClassificação() {
            return classificação;
        }

        public void setClassificação(int classificação) {
            this.classificação = classificação;
        }




        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }





    }

