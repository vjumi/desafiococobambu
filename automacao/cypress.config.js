const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    // página de acesso
    baseUrl: 'https://app-hom.cocobambu.com/',
    setupNodeEvents(on, config) {
      // implement node event listeners here         
    },
    
  },
  
});