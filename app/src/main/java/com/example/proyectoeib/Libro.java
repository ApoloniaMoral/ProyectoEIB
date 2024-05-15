package com.example.proyectoeib;

import java.util.Date;
public class Libro{
        private String id;
        private String titulo;
        private String autor;
        private int paginas;
        private String genero;
        private String editorial;
        private int anio;
        private String isbn;
        private String portada;

        //Contructores

        //Constructor vacío
        public Libro() {

        }

        //Constructor con todos los datos

        public Libro(String id, String titulo, String autor, int paginas, String genero, String editorial, int anio, String isbn, String portada) {
            this.id = id;
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
            this.genero = genero;
            this.editorial = editorial;
            this.anio = anio;
            this.isbn = isbn;
            this.portada = portada;
        }

        //Constructor con todos los datos menos id
        public Libro(String titulo, String autor, int paginas, String genero, String editorial, int anio, String isbn, String portada) {

            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
            this.genero = genero;
            this.editorial = editorial;
            this.anio = anio;
            this.isbn = isbn;
            this.portada = portada;

        }
        //Getters y Setters


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getPaginas() {
            return paginas;
        }

        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getPortada() {
            return portada;
        }

        public void setPortada(String portada) {
            this.portada = portada;
        }

        //ToString


        @Override
        public String toString() {
            return "Libro{" +
                    "id='" + id + '\'' +
                    ", titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", paginas=" + paginas +
                    ", genero='" + genero + '\'' +
                    ", editorial='" + editorial + '\'' +
                    ", anio=" + anio +
                    ", isbn='" + isbn + '\'' +
                    ", portada='" + portada + '\'' +
                    '}';
        }



}
