package org.example;

public class Course {
    private String kursname;
    private String dozent;
    private String raum;

    public Course(String kursname, String dozent, String raum) {
        this.kursname = kursname;
        this.dozent = dozent;
        this.raum = raum;
    }

    public String getKursname() {
        return kursname;
    }

    public void setKursname(String kursname) {
        this.kursname = kursname;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }
}
