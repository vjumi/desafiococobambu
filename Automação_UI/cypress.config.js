const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    // Página de acesso
    baseUrl: 'https://app-hom.cocobambu.com/',

    setupNodeEvents(on, config) {

    },

    //reporte dos testes
    reporter: "mochawesome",
    reporterOptions: {
      reportDir: "cypress/reports",
      overwrite: true,
      html: true,       
      json: false               
    }
  }
});