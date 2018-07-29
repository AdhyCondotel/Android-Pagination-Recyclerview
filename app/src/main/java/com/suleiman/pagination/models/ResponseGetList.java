package com.suleiman.pagination.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResponseGetList{

	@SerializedName("code")
	private int code;

	@SerializedName("listacaratvs")
	private List<ListacaratvsItem> listacaratvs;

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("message")
	private String message;

	@SerializedName("total_results")
	private int totalResults;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setListacaratvs(List<ListacaratvsItem> listacaratvs){
		this.listacaratvs = listacaratvs;
	}

	public List<ListacaratvsItem> getListacaratvs(){
		return listacaratvs;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	@Override
 	public String toString(){
		return 
			"ResponseGetList{" + 
			"code = '" + code + '\'' + 
			",listacaratvs = '" + listacaratvs + '\'' + 
			",page = '" + page + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",message = '" + message + '\'' + 
			",total_results = '" + totalResults + '\'' + 
			"}";
		}
}