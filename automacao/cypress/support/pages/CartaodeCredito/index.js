const el = require ('./elements').ELEMENTS
const card = require ('./dadosCartao').CARTAO

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
        
        cy.get(el.nmrCartao).type(card.nmrCartao_Incompleto)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Número do cartão inválido.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    nmrcartaodecredito_deletado(){
        cy.get(el.nmrCartao).type(card.nmrCartao)
        .clear()
        cy.get(el.alertaErroNmrCartao).contains("Número do cartão é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    nmrcartaodecredito_naoSuportado(){
        
        cy.get(el.nmrCartao).type(card.nmrCartao_NaoSuportado)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Cartão não suportado.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    dataExpiracao_deletado(){
        
        cy.get(el.nmrValidade).type(card.validade)
        .clear()
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Data de expiração é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    dataExpiracao_invalido(){
        
        cy.get(el.nmrValidade).type(card.validade_Invalido)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Data de expiração inválida.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    dataExpiracao_expirado(){
        
        cy.get(el.nmrValidade).type(card.Validade_Expirado)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Cartão expirou.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    CVV_deletado(){
        
        cy.get(el.nmrCVV).type(card.CVV)
        .clear()
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Código de verificação é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    CVV_invalido(){
        
        cy.get(el.nmrCVV).type(card.CVV_Invalido)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Código de verificação inválido.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    NomeTitular_deletado(){
        
        cy.get(el.nomeTitular).type(card.nomeTitular)
        .clear()
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Nome do titular é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    NomeTitular_invalido(){
        
        cy.get(el.nomeTitular).type(card.nomeTitular_invalido)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("Nome do titular inválido.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    CPFouCNPJ_deletado(){
        
        cy.get(el.CPFouCNPJ).type(card.CPF)
        .clear()
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("CPF/CNPJ é obrigatório.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }

    CPFouCNPJ_Invalido(){
        
        cy.get(el.CPFouCNPJ).type(card.CPF_Incompleto)
        cy.wait(1000)
        cy.get(el.alertaErroNmrCartao).contains("CPF/CNPJ inválido.")
        cy.get('button').contains('SALVAR').should('be.disabled')

    }


    
}

export default new cartaocredito ();