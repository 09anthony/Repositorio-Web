package VO;

import java.io.InputStream;
import java.sql.Date;

public class PdfVO {

    /*Todo los atributos*/
    int codigopdf;
    String nombrepdf;
    String autor;
    String materia;
    Date fecha;
    InputStream archivopdf;
    private byte[] archivopdf2;

    /*public PdfVO(int id, String name, byte[] archivo, String codaut) {
        this.codigopdf = id;
        this.nombrepdf = name;
        this.archivopdf2 = archivo;
        this.codautor = codaut;
    }*/

    public PdfVO(int id, String name, String autor, String materia, Date fecha, byte[] archivo) {
        this.codigopdf = id;
        this.nombrepdf = name;
        this.autor = autor;
        this.materia = materia;
        this.fecha = fecha;
        this.archivopdf2 = archivo;
    }

    public PdfVO() {
    }

    /*Todo los codigos get*/
    public int getCodigopdf() {
        return codigopdf;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public String getAutor() {
        return autor;
    }

    public String getMateria() {
        return materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public InputStream getArchivopdf() {
        return archivopdf;
    }

    /*Todo los codigos set*/
    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setArchivopdf(InputStream archivopdf) {
        this.archivopdf = archivopdf;
    }

    /**
     * @return the archivopdf2
     */
    public byte[] getArchivopdf2() {
        return archivopdf2;
    }

    /**
     * @param archivopdf2 the archivopdf2 to set
     */
    public void setArchivopdf2(byte[] archivopdf2) {
        this.archivopdf2 = archivopdf2;
    }

}
