package utilidades;

import java.io.Serializable;

public class ParametrosConexion implements Serializable {

    private String url;
    private String usuario;
    private String password;
    private String dataBase;
    private String server_name;

    public ParametrosConexion() {

    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dataBase
     */
    public String getDataBase() {
        return dataBase;
    }

    /**
     * @param dataBase the dataBase to set
     */
    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getServer_name() {
        if (server_name == null) {
            return "";
        }
        return server_name;
    }

    public void setServer_name(String server_name) {
        this.server_name = server_name;
    }
}
