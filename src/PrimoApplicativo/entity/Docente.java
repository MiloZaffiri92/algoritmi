package src.PrimoApplicativo.entity;

import java.util.Date;

public class Docente {

    private String nome;

    private String cognome;

    private Date data_nascita;



    public Docente() {
    }

    public void setNome(String nomeInIngresso) {
        this.nome = nomeInIngresso;
    }

    public void setCognome(String cognomeInIngresso) {
        this.cognome = cognomeInIngresso;
    }

    public void setData_nascita(Date data_nascita) {
        this.data_nascita=data_nascita;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public Date getData_nascita() {return this.data_nascita;}

}
