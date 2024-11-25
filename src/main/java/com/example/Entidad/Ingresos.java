package com.example.Entidad;
import javax.persistence.*;

@Entity
@Table(name = "ingresos")
public class Ingresos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fechaRegistro")
    private String fechaDeRegistro;

    @Column(name = "ingresoMensual")
    private int ingresoMensual;

public Ingresos(String fechaRegistro, int ingresoMensual) {
    this.fechaDeRegistro = fechaRegistro;
    this.ingresoMensual = ingresoMensual;
}

//Getters y Setters
public Long getId() {
    return id;
}

public void setId(Long id){
    this.id = id;
}

public String getFechaRegistro() {
    return fechaDeRegistro;
}

public void setFechaRegistro(String fechaDeRegistro){
    this.fechaDeRegistro = fechaDeRegistro;
}
public int getIngresoMensual() {
    return ingresoMensual;
}

public void setIngresoMensual(int ingresoMensual){
    this.ingresoMensual = ingresoMensual;
}

public int ingresosUsuario(int ingresos){
    return ingresos;
}

public void mostrarInformacionIngresos(){
    System.out.print("fecha registro: " + fechaDeRegistro);
    System.out.print("ingresos totales: " + ingresoMensual);
}
public static void main(String[] args) {
    Ingresos ingresos = new Ingresos("25-11-2024", 500000);
    ingresos.mostrarInformacionIngresos();
}



}
