/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.client.rest.cliente.endpoint;

import com.jobits.pos.cliente.core.domain.ClienteDomain;
import org.jobits.pos.client.rest.assembler.CrudModelAssembler;
import org.jobits.pos.client.rest.endpoint.CrudRestServiceTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Home
 */
@RestController
@RequestMapping(path = "/cliente_detail")
public class ClienteDetailEndPoint extends CrudRestServiceTemplate<ClienteDomain> {

    public static final String ADD_ORDEN_TO_CLIENTE_ORDEN_LIST_PATH = "/add_orden_to_cliente_list_orden";
    public static final RequestMethod ADD_ORDEN_TO_CLIENTE_ORDEN_LIST_METHOD = RequestMethod.PUT;

    ClienteModelAssembler clienteAssembler = new ClienteModelAssembler();

    @Override
    public ClientesDetailService getUc() {
        return PosCoreModule.getInstance().getImplementation(ClientesDetailService.class);
    }

    @Override
    public CrudModelAssembler<ClienteDomain> getAssembler() {
        return clienteAssembler;
    }

    @PutMapping(ADD_ORDEN_TO_CLIENTE_ORDEN_LIST_PATH)
    public boolean addOrdenToClientOrdenList(ClienteDomain elemento_seleccionado, Orden ordenToAdd) {//TODO; esto va en el core 
        getUc().addOrdenToClientOrdenList(elemento_seleccionado, ordenToAdd);
        return true;
    }

}
