package cuentas;
/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones básicas como ingresar y retirar dinero,
 * así como consultar el saldo actual.
 * 
 * @author Ramon
 * @version 1.0
 * @since 2026
 */
public class CCuenta {
	/**
     * Nombre del titular de la cuenta.
     */
	private String nombre;
	/**
     * Número identificador de la cuenta bancaria.
     */
	private String cuenta;
	/**
     * Saldo disponible en la cuenta, expresado en euros.
     */
    private double saldo;
    /**
     * Tipo de interés aplicado a la cuenta, expresado en porcentaje.
     */
    private double tipoInterés;
   
    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre El nuevo nombre del titular.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 /**
     * Obtiene el número identificador de la cuenta.
     *
     * @return El número de cuenta.
     */
	public String getCuenta() {
		return cuenta;
	}
	/**
     * Establece el número identificador de la cuenta.
     *
     * @param cuenta El nuevo número de cuenta.
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	  /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo disponible en euros.
     */
	public double getSaldo() {
		return saldo;
	}
	 /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo El nuevo saldo a asignar.
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return El tipo de interés en porcentaje.
     */
	public double getTipoInterés() {
		return tipoInterés;
	}
	 /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés El nuevo tipo de interés a aplicar.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	
	/**
     * Constructor por defecto.
     * Crea una cuenta bancaria sin inicializar ningún atributo.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     * Crea una cuenta bancaria con los datos del titular y saldo inicial.
     *
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número identificador de la cuenta.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return El saldo disponible en euros.
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * La cantidad debe ser un valor positivo.
     *
     * @param cantidad Importe en euros a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Retira una cantidad de dinero de la cuenta.
     * La cantidad debe ser positiva y no puede superar el saldo disponible.
     *
     * @param cantidad Importe en euros a retirar.
     * @throws Exception Si la cantidad es negativa o cero.
     * @throws Exception Si el saldo disponible es insuficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

}
