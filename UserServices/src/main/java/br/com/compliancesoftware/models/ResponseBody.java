package br.com.compliancesoftware.models;

import java.io.Serializable;

import br.com.compliancesoftware.entities.Entity;

public class ResponseBody implements Serializable{

	/**
	 * Auto generated serial.
	 */
	private static final long serialVersionUID = 5539860503424735819L;

	private String message;
	
	private String status;
	
	private Entity entity;

	public static final String STATUS_ERROR = "Erro";
	
	public static final String STATUS_OK = "Ok";
	
	public ResponseBody() {
		this.message = "Erro no servidor.";
		this.status = STATUS_ERROR;
		this.entity = null;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
