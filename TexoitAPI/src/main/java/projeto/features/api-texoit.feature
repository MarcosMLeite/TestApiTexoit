# language: pt
# encoding: utf-8

Funcionalidade: Consulto status code via API

  Esquema do Cenário: Consulto  o retorno do statuscode <statusCode>
    Dado que tenho acesso a API "https://jsonplaceholder.typicode.com/"
    Quando faço a consulta  com método GET
    Então valido  statuscode <statusCode> 
    Exemplos:
          | statusCode   | status  |
          | 200          | success |
                           
   