const el = require ('./elements').ELEMENTS

class endereco{

    acessarEndereco_Incorreto(){
        cy.wait(2000)
        cy.get(el.btnInserirEndereco).type("Cocos")
        cy.wait(8000)
        cy.contains('Cocos - BA, Brasil').click()
        cy.wait(8000)
        cy.request("/delivery").then((response) => {
            expect(response.status).to.eq(200)
        })
        cy.get(el.tituloErro).contains('Ops...')
        cy.get(el.subtituloErro).contains('O endereço informado não é atendido por nenhuma das nossas lojas. Que tal tentar outro endereço?').should('be.visible')
        

    }
}

export default new endereco();