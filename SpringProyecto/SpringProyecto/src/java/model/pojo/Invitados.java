package model.pojo;
// Generated 11-nov-2018 12:53:19 by Hibernate Tools 4.3.1



/**
 * Invitados generated by hbm2java
 */
public class Invitados  implements java.io.Serializable {


     private Integer id;
     private int idIntercambio;
     private String emailUser;
     private String status;

    public Invitados() {
    }

    public Invitados(int idIntercambio, String emailUser, String status) {
       this.idIntercambio = idIntercambio;
       this.emailUser = emailUser;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getIdIntercambio() {
        return this.idIntercambio;
    }
    
    public void setIdIntercambio(int idIntercambio) {
        this.idIntercambio = idIntercambio;
    }
    public String getEmailUser() {
        return this.emailUser;
    }
    
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


