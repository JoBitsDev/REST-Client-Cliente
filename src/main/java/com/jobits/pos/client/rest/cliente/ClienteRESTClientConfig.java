/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.client.rest.cliente;

import com.jobits.pos.cliente.core.module.ClienteCoreModule;
import com.jobits.pos.cliente.repo.module.ClienteRepoModule;
import org.springframework.stereotype.Component;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
@Component
public class ClienteRESTClientConfig {

    public static final String BASE_PACKAGE = "com.jobits.pos.reserva.client.rest";

    static {
        ClienteCoreModule.init(ClienteRepoModule.init());
    }

}
