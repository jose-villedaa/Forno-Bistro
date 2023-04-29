package com.michaelsalvatierra.models.domain;

/**
 *
 * @author Octavio Alejandro Corzo Reyes
 * @date 2/09/2022
 * @time 19:30:44
 *
 * Código Técnico: IN5BM
 *
 */
public class Cena {

    private int id;
    private String nombre;
    private int postreId;
    private String nombrePostre;
    private int platilloId;
    private String nombrePlatillo;
    private int bebidaId;
    private String nombreBebida;
    private String descripcion; 
    private float precio;
    private String rutaImagen;
    private String tiempo;

    public Cena(int id, String nombre, int postreId, String nombrePostre, int platilloId, String nombrePlatillo, int bebidaId, String nombreBebida, String Descripcion, float precio, String rutaImagen, String tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.postreId = postreId;
        this.nombrePostre = nombrePostre;
        this.platilloId = platilloId;
        this.nombrePlatillo = nombrePlatillo;
        this.bebidaId = bebidaId;
        this.nombreBebida = nombreBebida;
        this.descripcion = Descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.tiempo = tiempo;
    }

    public Cena(int id, String nombre, int postreId, int platilloId, int bebidaId, String Descripcion, float precio, String rutaImagen, String tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.postreId = postreId;
        this.platilloId = platilloId;
        this.bebidaId = bebidaId;
        this.descripcion = Descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.tiempo = tiempo;
    }
  
    public Cena(int id, String nombre, int postreId, int platilloId, int bebidaId, String descripcion, float precio, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.postreId = postreId;
        this.platilloId = platilloId;
        this.bebidaId = bebidaId;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }

    public Cena(String nombre, int postreId, int platilloId, int bebidaId, String descripcion, float precio, String rutaImagen, String tiempo) {
        this.nombre = nombre;
        this.postreId = postreId;
        this.platilloId = platilloId;
        this.bebidaId = bebidaId;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.tiempo = tiempo;
    }
    

    public Cena(int id) {
        this.id = id;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }



    public Cena() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPostreId() {
        return postreId;
    }

    public void setPostreId(int postreId) {
        this.postreId = postreId;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public void setNombrePostre(String nombrePostre) {
        this.nombrePostre = nombrePostre;
    }

    public int getPlatilloId() {
        return platilloId;
    }

    public void setPlatilloId(int platilloId) {
        this.platilloId = platilloId;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public int getBebidaId() {
        return bebidaId;
    }

    public void setBebidaId(int bebidaId) {
        this.bebidaId = bebidaId;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Desayunos{" + "id=" + id + ", nombre=" + nombre + ", postreId=" + postreId + ", nombrePostre=" + nombrePostre + ", platilloId=" + platilloId + ", nombrePlatillo=" + nombrePlatillo + ", bebidaId=" + bebidaId + ", nombreBebida=" + nombreBebida + ", Descripcion=" + descripcion + ", precio=" + precio + ", rutaImagen=" + rutaImagen + ", tiempo=" + tiempo + '}';
    }
    
    

}
