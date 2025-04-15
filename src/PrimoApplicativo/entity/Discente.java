package src.PrimoApplicativo.entity;

public class Discente {
    private String nome;
    private String cognome;
    private Integer matricola;
    private Integer eta;
    private String citta_residenza;

    public Discente(){

    }
    //Tutti i set
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public void setMatricola(Integer matricola) {
            this.matricola = matricola;
        }

        public void setEta(Integer eta) {
            this.eta = eta;
        }

        public void setCitta_residenza(String citta_residenza) {
            this.citta_residenza = citta_residenza;
        }

    //Tutti i get
        public String getNome() {
            return this.nome;
        }

        public String getCognome() {
            return this.cognome;
        }

        public Integer getMatricola() {
            return this.matricola;
        }

        public Integer getEta() {
            return this.eta;
        }

        public String getCitta_residenza() {
            return this.citta_residenza;
        }
}
