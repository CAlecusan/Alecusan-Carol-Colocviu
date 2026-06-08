package com.parking;


    public class Judet {
        String codIso;
        String nume;
        String regiune;
        Integer nrLocuitori;
        Integer suprafata;

        public Judet(String codIso, String nume, String regiune, Integer nrLocuitori, Integer suprafata) {
            if(suprafata == null) {
                throw new NullPointerException("suprafata is null");
            }else if(suprafata < 0) {
                throw new IllegalArgumentException("suprafata is negative");
            }
            this.codIso = codIso;
            this.nume = nume;
            this.regiune = regiune;
            this.nrLocuitori = nrLocuitori;
            this.suprafata = suprafata;
        }

        public String getCodIso() {
            return codIso;
        }

        public void setCodIso(String codIso) {
            this.codIso = codIso;
        }

        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public String getRegiune() {
            return regiune;
        }

        public void setRegiune(String regiune) {
            this.regiune = regiune;
        }

        public Integer getNrLocuitori() {
            return nrLocuitori;
        }

        public void setNrLocuitori(Integer nrLocuitori) {
            this.nrLocuitori = nrLocuitori;
        }

        public Integer getSuprafata() {
            return suprafata;
        }

        public void setSuprafata(Integer suprafata) {
            this.suprafata = suprafata;
        }

        @Override
        public String toString() {
            return codIso + " " + nume + " " + regiune + " " + nrLocuitori + " " + suprafata;
        }
    }


