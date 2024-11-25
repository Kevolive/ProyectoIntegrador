package com.example;

import com.example.Entidad.Contacto;
import com.example.Entidad.Gastos;
import com.example.Entidad.Ingresos;
import com.example.Entidad.InicioSesion;
import com.example.Entidad.Registro;
import com.example.Entidad.Saldo;
import com.example.Entidad.TipoPersona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
    
    //Llamdo de metodos
    // leerIngresos(3L);
    // leerContacto(3L);
    // leerInicioDeSesion(3L);
    // leerRegistro(3L);
    // leerGastos(3L);
    // leerSaldo(3L);
    // actualizarIngresos(5L, "12/12/2024", 2000000);
    // actualizarGastos(4L, 200000, 3000000, 50000, 10000000, 0, 500000, 800000);
    // eliminarRegistro(5L);
    // eliminarGastos(5L);
    
        
        em.getTransaction().begin();

        Ingresos ingreso = new Ingresos(null, 0);
        ingreso.setFechaRegistro("18-11-2024");
        ingreso.setIngresoMensual(5000000);

        em.persist(ingreso);

        TipoPersona tipoPersona1 = new TipoPersona();
        tipoPersona1.setPersona("Natural");

        TipoPersona tipoPersona2 = new TipoPersona();
        tipoPersona2.setPersona("Juridica");

        em.persist(tipoPersona1);
        em.persist(tipoPersona2);

        InicioSesion inicioSesion = new InicioSesion();

        inicioSesion.setNombreUsuario("Juancho");
        inicioSesion.setContrasena("juanchoelcapo");

        em.persist(inicioSesion);

        Contacto contacto = new Contacto();
        contacto.setNombre("Kevin");
        contacto.setApellido("Olivella");
        contacto.setEmail("kolivella@cesde.net");
        contacto.setComentario("Pongo una queja de que Juancho me debe plata");
        contacto.setRegistroId(1);

        em.persist(contacto);

        Registro registro1 = new Registro();
        registro1.setNombre("Jhon Jairo");
        registro1.setApellido("Devia");
        registro1.setRazonSocial(null);
        registro1.setNit(0);
        registro1.setEmail("jj@cesde.net");
        registro1.setTelefono(60457689);
        registro1.setContraseña("jjelbizarro");

        Registro registro2 = new Registro();
        registro2.setNombre(null);
        registro2.setApellido(null);
        registro2.setRazonSocial("Cesde");
        registro2.setNit(900890765);
        registro2.setEmail("Cesde@cesde.net");
        registro2.setTelefono(6049909);
        registro2.setContraseña("pancracio");

        em.persist(registro1);
        em.persist(registro2);

        Saldo slado1 = new Saldo();
        slado1.setfecha("2024/11/24");
        slado1.setTotal(4000000);

        em.persist(slado1);

        Gastos gastos = new Gastos(0, 0, 0, 0, 0, 0, 0);
        gastos.setcomida(500000);
        gastos.setAlquiler(1500000);
        gastos.setTansporte(140000);
        gastos.setNomina(100000000);
        gastos.setSeguridad(404000);
        gastos.setEducacion(250000);
        gastos.setOtros(100000);

        em.persist(gastos);
        
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    

    
    
    // //Leer 
    // public static Ingresos leerIngresos(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Ingresos ingresos1 = em.find(Ingresos.class,id);
    //     em.close();
    //     return ingresos1;
    // }

    // public static InicioSesion leerInicioDeSesion(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     InicioSesion inicio1 = em.find(InicioSesion.class,id);
    //     em.close();
    //     return inicio1;
    // }

    // public static Contacto leerContacto(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Contacto contacto1 = em.find(Contacto.class,id);
    //     em.close();
    //     return contacto1;
    // }

    // public static Registro leerRegistro(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Registro registro1 = em.find(Registro.class,id);
    //     em.close();
    //     return registro1;
    // }

    // public static Saldo leerSaldo(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Saldo saldo1 = em.find(Saldo.class,id);
    //     em.close();
    //     return saldo1;
    // }

    // public static Gastos leerGastos(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Gastos gastos1 = em.find(Gastos.class,id);
    //     em.close();
    //     return gastos1;
    // }

    // Actualizar

    // public static void actualizarIngresos(Long id, String nuevaFecha, int nuevoIngreso) {
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();
        
    //     Ingresos ingresos2 = em.find(Ingresos.class, id);
    //     if (ingresos2 != null) {
    //         ingresos2.setFechaRegistro(nuevaFecha);
    //         ingresos2.setIngresoMensual(nuevoIngreso);
    //         em.merge(ingresos2);
    //     }

    //     em.getTransaction().commit();
    //     em.close();
    // }

    // public static void actualizarGastos(Long id, int comida, int alquiler, int transporte, int nomina, int seguridad, int educacion, int otros) {
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Gastos gastos2 = em.find(Gastos.class, id);
    //     if (gastos2 != null) {
    //         gastos2.setcomida(comida);
    //         gastos2.setAlquiler(alquiler);
    //         gastos2.setTansporte(transporte);
    //         gastos2.setNomina(nomina);
    //         gastos2.setSeguridad(seguridad);
    //         gastos2.setEducacion(educacion);
    //         gastos2.setOtros(otros);
    //         em.merge(gastos2); 
    //     }

    //     em.getTransaction().commit();
    //     em.close();
    // }

    //Eliminar

    // public static void eliminarRegistro(Long id) {
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Registro registro3 = em.find(Registro.class, id);
    //     if (registro3 != null) {
    //         em.remove(registro3); 
    //     }

    //     em.getTransaction().commit();
    //     em.close();
    // }

//     public static void eliminarGastos(Long id) {
//         EntityManager em = emf.createEntityManager();
//         em.getTransaction().begin();

//         Gastos gastos3 = em.find(Gastos.class, id);
//         if (gastos3 != null) {
//             em.remove(gastos3); 
//         }

//         em.getTransaction().commit();
//         em.close();
//     }
}
