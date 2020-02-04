package model.logic;

public class Infracciones implements Comparable<Infracciones> {

	//---------
	//ATRIBUTOS
	//---------

	/**
	 * 
	 */
	private String TYPE = "";

	/**
	 * 
	 */
	private int OBJECTID = -1;

	/**
	 * 
	 */
	private String FECHA_HORA = "";

	/**
	 * 
	 */
	private String CLASE_VEHI = "";

	/**
	 * 
	 */
	private String TIPO_SERVI = "";

	/**
	 * 
	 */
	private String INFRACCION = "";

	/**
	 * 
	 */
	private String DES_INFRAC = "";

	/**
	 * 
	 */
	private String LOCALIDAD = "";

	/**
	 * 
	 */
	private String TYPE_GEO = "";

	/**
	 * 
	 */
	private String COORDINATES = "";

	//-------------
	//CONSTRUCTORES
	//-------------

	public Infracciones( String tipo, int id, String fecha, String clase, String tipoS, String infraccion ,String descripcion, String localidad, String tipoGeo, String coordenadas)
	{
		TYPE = tipo;
		OBJECTID = id;
		FECHA_HORA = fecha;
		TIPO_SERVI = tipoS;
		INFRACCION = infraccion;
		DES_INFRAC = descripcion;
		LOCALIDAD = localidad;
		TYPE_GEO = tipoGeo;
		COORDINATES = coordenadas;
	}

	//-------
	//METODOS
	//-------

	/**
	 * 
	 * @return
	 */
	public String getTYPE() {
		return TYPE;
	}

	/**
	 * 
	 * @param tYPE
	 */
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	/**
	 * 
	 * @return
	 */
	public int getOBJECTID() {
		return OBJECTID;
	}

	/**
	 * 
	 * @param oBJECTID
	 */
	public void setOBJECTID(int oBJECTID) {
		OBJECTID = oBJECTID;
	}

	/**
	 * 
	 * @return
	 */
	public String getFECHA_HORA() {
		return FECHA_HORA;
	}

	/**
	 * 
	 * @param fECHA_HORA
	 */
	public void setFECHA_HORA(String fECHA_HORA) {
		FECHA_HORA = fECHA_HORA;
	}

	/**
	 * 
	 * @return
	 */
	public String getCLASE_VEHI() {
		return CLASE_VEHI;
	}

	/**
	 * 
	 * @param cLASE_VEHI
	 */
	public void setCLASE_VEHI(String cLASE_VEHI) {
		CLASE_VEHI = cLASE_VEHI;
	}

	/**
	 * 
	 * @return
	 */
	public String getTIPO_SERVI() {
		return TIPO_SERVI;
	}

	/**
	 * 
	 * @param tIPO_SERVI
	 */
	public void setTIPO_SERVI(String tIPO_SERVI) {
		TIPO_SERVI = tIPO_SERVI;
	}

	/**
	 * 
	 * @return
	 */
	public String getINFRACCION() {
		return INFRACCION;
	}

	/**
	 * 
	 * @param iNFRACCION
	 */
	public void setINFRACCION(String iNFRACCION) {
		INFRACCION = iNFRACCION;
	}

	/**
	 * 
	 * @return
	 */
	public String getDES_INFRAC() {
		return DES_INFRAC;
	}

	/**
	 * 
	 * @param dES_INFRAC
	 */
	public void setDES_INFRAC(String dES_INFRAC) {
		DES_INFRAC = dES_INFRAC;
	}

	/**
	 * 
	 * @return
	 */
	public String getLOCALIDAD() {
		return LOCALIDAD;
	}

	/**
	 * 
	 * @param lOCALIDAD
	 */
	public void setLOCALIDAD(String lOCALIDAD) {
		LOCALIDAD = lOCALIDAD;
	}

	/**
	 * 
	 * @return
	 */
	public String getTYPE_GEO() {
		return TYPE_GEO;
	}

	/**
	 * 
	 * @param tYPE_GEO
	 */
	public void setTYPE_GEO(String tYPE_GEO) {
		TYPE_GEO = tYPE_GEO;
	}

	/**
	 * 
	 * @return
	 */
	public String getCOORDINATES() {
		return COORDINATES;
	}

	/**
	 * 
	 * @param cOORDINATES
	 */
	public void setCOORDINATES(String cOORDINATES) {
		COORDINATES = cOORDINATES;
	}

	/**
	 * 
	 */
	@Override
	public int compareTo(Infracciones o) {
		// TODO Auto-generated method stub
		return 0;
	}
}