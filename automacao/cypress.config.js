const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    // página de acesso
    baseUrl: 'https://app-hom.cocobambu.com/',
    
    setupNodeEvents(on, config) {
      // implement node event listeners here         
    },

    "reporter": "mochawesome",
    "reporterOptions": {
    "reportDir": "cypress/mochawesome-report",
    "overwrite": false,
    "html": true,
    "json": false,
    "timestamp": "mmddyyyy_HHMMss",
    "cdn": true,
    "charts": true
  }
    
  },
  
});