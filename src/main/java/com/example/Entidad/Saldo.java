package com.example.Entidad;

import javax.persistence.*;

@Entity
@Table(name = "saldo")
public class Saldo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "total")
    private int total;

    public long getId (){
        return id;
    }

    public void setId (long id){
        this.id = id;
    }

    public String getFecha(){
        return fecha;
    }

    public void setfecha(String fecha){
        this.fecha = fecha;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int total){
        this.total = total;

    }

    public static int mostrarSaldo(int ingresos, int gastos) {
        return ingresos + gastos;
    }

    public static void main(String[] args) {

        int ingresos = 4000000;
        int gastos = 2000000;

        int resultado = mostrarSaldo(ingresos, gastos);

        System.out.println("El saldo es"  + resultado);
    }
}

