/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 *
 * @author Ana
 */
public class CCuenta {

    /**
     *
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta() {
    }

    /**
     *
     * @param nom Nombre del titular de la cuenta
     * @param cue Numero de cuenta
     * @param sal Total de salario en la cuenta
     * @param tipo Motivo ingreso/retiro de saldo.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     *
     * @param nom Da el nombre del propietatorio de la cuenta
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     *
     * @return
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public double estado() {
        return saldo;
    }

    /**
     *
     * @param cantidad Cantidad de saldo a depositar
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad Cantidad de saldo a retirar
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     *
     * @return
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta Numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @param saldo Saldo disponible para retirar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés Motivo ingreso/retiro de saldo.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
