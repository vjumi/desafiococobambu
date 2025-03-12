/// <reference types="cypress"/>

import CartaodeCredito from '../support/pages/CartaodeCredito';
import Login from '../support/pages/Login';

describe('Projeto de desafio app cocobambu', () => {

      beforeEach (() => {
        Login.acessarLogin()
        Login.efetuarLogin()
    });

     /**
         * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito
         * ao inserir o número do cartão com 1(um) dígito a menos
         */
    it.only('Numero do cartao de credito invalido', () => {

        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.nmrcartaodecredito_invalido()

    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito
     * ao inserir o número do cartão e apagar em seguida
     */

    it('Numero do cartao de credito deletado', () => {
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.nmrcartaodecredito_deletado()
    });

});
