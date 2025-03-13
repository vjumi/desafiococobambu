/// <reference types="cypress"/>

import CartaodeCredito from '../support/pages/CartaodeCredito';
import Endereco from '../support/pages/Endereco';
import Login from '../support/pages/Login';

describe('Projeto de desafio app cocobambu', () => {

      beforeEach (() => {
        Login.acessarSistema()
    });

        /**
        * Validar a capacidade do aplicativo em disponibilizar informações exclusivamente para endereços válidos.
        */

     it('Endereço fora da área de atendimento', () => {

        Endereco.acessarEndereco_Incorreto()

    });

     /**
         * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão com 1(um) dígito a menos
         */
    it('Numero do cartao de credito incompleto', () => {

        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.nmrcartaodecredito_invalido()

    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão e apagar em seguida
     */

    it('Numero do cartao de credito deletado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.nmrcartaodecredito_deletado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o número do cartão não suportado
     */

    it('Numero do cartao de credito invalido', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.nmrcartaodecredito_naoSuportado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão e apagar
     */

    it('Data de expiracao deletado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.dataExpiracao_deletado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão inválida
     */

    it('Data de expiracao invalida', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.dataExpiracao_invalido()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir a data de expiração do cartão já expirado
     */

    it('Data de expiracao expirado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.dataExpiracao_expirado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o código de segurança e apagar a informação
     */

    it('CVV deletado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.CVV_deletado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o código de segurança do cartão inválida
     */

    it('CVV invalido', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.CVV_invalido()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o nome completo do titular do cartão e apagar a informação
     */

    it('Nome do titular do cartão de crédito deletado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.NomeTitular_deletado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o nome impresso no cartão inválida
     */

    it('Nome do titular do cartão de crédito invalido', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.NomeTitular_invalido()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir o CPF do titular do cartão e apagar a informação
     */

    it('CPF do titular do cartão de crédito deletado', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.CPFouCNPJ_deletado()
    });

    /**
     * Verificar se o aplicativo está processando corretamente as informações do cartão de crédito ao inserir CPF do titular do cartão inválido
     */

    it('CPF do titular do cartão de crédito invalido', () => {
        Login.efetuarLogin()
        CartaodeCredito.acessarFormaPagamento()
        CartaodeCredito.CPFouCNPJ_Invalido()
    });


});
