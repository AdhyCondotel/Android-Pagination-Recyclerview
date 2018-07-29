package com.suleiman.pagination.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ListacaratvsItem{

	@SerializedName("nama_acaratv")
	private String namaAcaratv;

	@SerializedName("viewers")
	private String viewers;

	@SerializedName("foto")
	private String foto;

	@SerializedName("acaratv_berlangsung")
	private String acaratvBerlangsung;

	@SerializedName("status_channel")
	private String statusChannel;

	@SerializedName("kd_acaratv")
	private String kdAcaratv;

	@SerializedName("waktu_posting")
	private String waktuPosting;

	public void setNamaAcaratv(String namaAcaratv){
		this.namaAcaratv = namaAcaratv;
	}

	public String getNamaAcaratv(){
		return namaAcaratv;
	}

	public void setViewers(String viewers){
		this.viewers = viewers;
	}

	public String getViewers(){
		return viewers;
	}

	public void setFoto(String foto){
		this.foto = foto;
	}

	public String getFoto(){
		return foto;
	}

	public void setAcaratvBerlangsung(String acaratvBerlangsung){
		this.acaratvBerlangsung = acaratvBerlangsung;
	}

	public String getAcaratvBerlangsung(){
		return acaratvBerlangsung;
	}

	public void setStatusChannel(String statusChannel){
		this.statusChannel = statusChannel;
	}

	public String getStatusChannel(){
		return statusChannel;
	}

	public void setKdAcaratv(String kdAcaratv){
		this.kdAcaratv = kdAcaratv;
	}

	public String getKdAcaratv(){
		return kdAcaratv;
	}

	public void setWaktuPosting(String waktuPosting){
		this.waktuPosting = waktuPosting;
	}

	public String getWaktuPosting(){
		return waktuPosting;
	}

	@Override
 	public String toString(){
		return 
			"ListacaratvsItem{" + 
			"nama_acaratv = '" + namaAcaratv + '\'' + 
			",viewers = '" + viewers + '\'' + 
			",foto = '" + foto + '\'' + 
			",acaratv_berlangsung = '" + acaratvBerlangsung + '\'' + 
			",status_channel = '" + statusChannel + '\'' + 
			",kd_acaratv = '" + kdAcaratv + '\'' + 
			",waktu_posting = '" + waktuPosting + '\'' + 
			"}";
		}
}