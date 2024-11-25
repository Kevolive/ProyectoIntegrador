package com.example.Entidad;

import javax.persistence.*;

@Entity
@Table(name = "gastos")
public class Gastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comida")
    private int comida;

    @Column(name = "alquiler")
    private int alquiler;

    @Column(name = "transporte")
    private int transporte;

    @Column(name = "nomina")
    private int nomina;

    @Column(name = "seguridad")
    private int seguridad;

    @Column(name = "educacion")
    private int educacion;

    @Column(name = "otros")
    private int otros;

    public Gastos(int comida, int alquiler, int transporte, int nomina, int seguridad, int educacion, int otros){
        this.comida = comida;
        this.alquiler = alquiler;
        this.transporte = transporte;
        this.nomina = nomina;
        this.seguridad = seguridad;
        this.educacion = educacion;
        this.otros = otros;
    }
    // getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getComida() {
        return comida;
    }

    public void setcomida(int comida) {
        this.comida = comida;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTansporte(int transporte) {
        this.transporte = transporte;
    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public int getEducacion() {
        return educacion;
    }

    public void setEducacion(int educacion) {
        this.educacion = educacion;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }


    
    
    public int sumaGastos(){
        int sumaTotalGastos = comida + alquiler + transporte + nomina + seguridad + educacion + otros;
        return sumaTotalGastos;
    }
    public void mostrarInformacionGastos(){
        System.out.print("Suma total de gastos: " + sumaGastos());
    }

    public static void main(String[] args) {
        Gastos gastos = new Gastos(50000, 100000, 300000, 0, 0, 400000, 0);
        gastos.mostrarInformacionGastos();
    }


}
