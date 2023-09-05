package com.facol.livraria.builders;

import com.facol.livraria.entities.Client;

public class ClientBuilder {

    private Long id;
    private String name;
    private String cpf;
    private String cnpj;
    private String cellPhone;

    public ClientBuilder id(Long id){
        this.id = id;
        return this;
    }

    public ClientBuilder name(String name){
        this.name = name;
        return this;
    }

    public ClientBuilder cpf(String cpf){
        this.cpf = cpf;
        return this;
    }

    public ClientBuilder cnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public ClientBuilder cellPhone(String cellPhone){
        this.cellPhone = cellPhone;
        return this;
    }

    public Client build(){
        return new Client(id, name, cpf, cnpj, cellPhone);
    }
}
