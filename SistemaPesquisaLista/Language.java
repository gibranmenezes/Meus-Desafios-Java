package SistemaPesquisaLista;

import java.util.Objects;
//essa classe vai receber a entrada o usuario para pesquisar o item na lista.
public class Language {

    private String name;

    public Language(String name) {
        this.name = name;
    }

    public Language() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    //o equals e hashcode são padrão. Pode ser aqui o problema
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language)) return false;
        Language language = (Language) o;
        return Objects.equals(getName(), language.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

