/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.client.rest.cliente.assembler;

import com.jobits.pos.client.rest.cliente.endpoint.ClienteDetailEndPoint;
import com.jobits.pos.cliente.core.domain.ClienteDomain;
import org.jobits.pos.client.rest.assembler.CrudModelAssembler;

/**
 *
 * @author Home
 */
public class ClienteModelAssembler extends CrudModelAssembler<ClienteDomain> {

    public ClienteModelAssembler() {
        super(ClienteDetailEndPoint.class);
    }

    @Override
    public Object getId(ClienteDomain entity) {
        return entity.getId();
    }

}
