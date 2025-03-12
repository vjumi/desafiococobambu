const el = require ('./elements').ELEMENTS
class cartaocredito{

    acessarFormaPagamento(){
        cy.wait(20000)
        cy.get(el.btnPerfil).click()
        cy.wait(1000)
        cy.contains('Carteira de pagamentos').click()
        cy.wait(2000)
        cy.get('button').contains('CADASTRAR FORMA DE PAGAMENTO').click()
        cy.wait(2000)
        cy.get(el.btnCredito).click()
        cy.wait(2000)
    }

    nmrcartaodecredito_invalido(){
        
        cy.get(el.nmrCartao).type('1234567890123')
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Número do cartão inválido.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }
    nmrcartaodecredito_deletado(){
        cy.get(el.nmrCartao).type('123')
        .type('{backspace}{backspace}{backspace}')
        cy.get(el.alertaErroNmrCartao).contains("Número do cartão é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }
    
}

export default new cartaocredito ();