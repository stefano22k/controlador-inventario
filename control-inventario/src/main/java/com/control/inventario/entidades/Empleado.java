package com.control.inventario.entidades;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;



@Entity
@Table(name = "empleados")

public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
	@NotEmpty
	@Email
	private String email;
	@NotNull
	private String telefono;
	@NotEmpty
	private String tipoDePC;
	@NotEmpty
	private String procesador;
	@NotEmpty
	private String memoriaRAM;
	@NotEmpty
	private String disco;
	@NotEmpty
	private String marca;
	@NotEmpty
	private String modelo;
	@NotEmpty
	private String numeroDeSerie;
	@NotEmpty
	private String password;
	@NotEmpty
	private String office;
	@NotEmpty
	private String autologica;
	@NotEmpty
	private String monitor;
	@NotEmpty
	private String imeiCel;
	@NotEmpty
	private String correoCel;
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaControlInventario;
	public Empleado() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipoDePC() {
		return tipoDePC;
	}
	public void setTipoDePC(String tipoDePC) {
		this.tipoDePC = tipoDePC;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	public String getDisco() {
		return disco;
	}
	public void setDisco(String disco) {
		this.disco = disco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getAutologica() {
		return autologica;
	}
	public void setAutologica(String autologica) {
		this.autologica = autologica;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getImeiCel() {
		return imeiCel;
	}
	public void setImeiCel(String imeiCel) {
		this.imeiCel = imeiCel;
	}
	public String getCorreoCel() {
		return correoCel;
	}
	public void setCorreoCel(String correoCel) {
		this.correoCel = correoCel;
	}
	public Date getFechaControlInventario() {
		return fechaControlInventario;
	}
	public void setFechaControlInventario(Date fechaControlInventario) {
		this.fechaControlInventario = fechaControlInventario;
	}
	
	
	
}
