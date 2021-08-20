@tag
Feature: Buscar en google
verificar si en google aparece la busqueda de mi pagina

Scenario: Buscar mi nombre en google
Given ABRIR LA PAGINA DE GOOGLE
When CAPTURA MI BUSQUEDA
Then CIERRA EL NAVEGADOR
