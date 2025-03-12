//ações de interação com a página
const el = require ('./elements').ELEMENTS
class Login {
    acessarLogin(){
        cy.visit('')
    }

    efetuarLogin(){
        cy.get(el.btnPerfil).click()
        cy.wait(1000)
        cy.get(el.btnPerfilEntrar).click()
        cy.wait(1000)
        cy.get(el.campoEmail).type('valmirjunior@mailinator.com')
        cy.wait(1000)
        cy.get(el.campoSenha).type('Senha@123456')
        cy.wait(1000)
        cy.get('button').contains('ENTRAR').click()
        cy.get('button').contains('FECHAR').click()
        cy.wait(1000)
        cy.get(el.campoCodigo1).type('A')
        cy.get(el.campoCodigo2).type('A')
        cy.get(el.campoCodigo3).type('A')
        cy.get(el.campoCodigo4).type('A')
        cy.get(el.campoCodigo5).type('A')
        cy.get(el.campoCodigo6).type('A')
        cy.wait(1000)
        cy.get('button').contains(' ACESSAR ').click()
    }
}

export default new Login ();