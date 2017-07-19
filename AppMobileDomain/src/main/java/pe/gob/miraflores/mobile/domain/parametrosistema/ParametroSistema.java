package pe.gob.miraflores.mobile.domain.parametrosistema;

public class ParametroSistema {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PARAMETRO_SISTEMA.IDPARAMETROSISTEMA
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    private String idparametrosistema;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PARAMETRO_SISTEMA.VALOR
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    private String valor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PARAMETRO_SISTEMA.CODAPLICACION
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    private String codaplicacion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PARAMETRO_SISTEMA.IDPARAMETROSISTEMA
     *
     * @return the value of PARAMETRO_SISTEMA.IDPARAMETROSISTEMA
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public String getIdparametrosistema() {
        return idparametrosistema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PARAMETRO_SISTEMA.IDPARAMETROSISTEMA
     *
     * @param idparametrosistema the value for PARAMETRO_SISTEMA.IDPARAMETROSISTEMA
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public void setIdparametrosistema(String idparametrosistema) {
        this.idparametrosistema = idparametrosistema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PARAMETRO_SISTEMA.VALOR
     *
     * @return the value of PARAMETRO_SISTEMA.VALOR
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public String getValor() {
        return valor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PARAMETRO_SISTEMA.VALOR
     *
     * @param valor the value for PARAMETRO_SISTEMA.VALOR
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PARAMETRO_SISTEMA.CODAPLICACION
     *
     * @return the value of PARAMETRO_SISTEMA.CODAPLICACION
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public String getCodaplicacion() {
        return codaplicacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PARAMETRO_SISTEMA.CODAPLICACION
     *
     * @param codaplicacion the value for PARAMETRO_SISTEMA.CODAPLICACION
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    public void setCodaplicacion(String codaplicacion) {
        this.codaplicacion = codaplicacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARAMETRO_SISTEMA
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ParametroSistema other = (ParametroSistema) that;
        return (this.getIdparametrosistema() == null ? other.getIdparametrosistema() == null : this.getIdparametrosistema().equals(other.getIdparametrosistema()))
            && (this.getValor() == null ? other.getValor() == null : this.getValor().equals(other.getValor()))
            && (this.getCodaplicacion() == null ? other.getCodaplicacion() == null : this.getCodaplicacion().equals(other.getCodaplicacion()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARAMETRO_SISTEMA
     *
     * @mbggenerated Thu Nov 26 11:59:53 COT 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdparametrosistema() == null) ? 0 : getIdparametrosistema().hashCode());
        result = prime * result + ((getValor() == null) ? 0 : getValor().hashCode());
        result = prime * result + ((getCodaplicacion() == null) ? 0 : getCodaplicacion().hashCode());
        return result;
    }
}