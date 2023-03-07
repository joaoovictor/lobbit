# lobbit

A lobbit é uma plataforma independente que permite você pesquisar antes de comprar, e ainda expor sua experiência depois de comprar.

## Endpoints

- Usuários

  - Cadastrar
  - Listar todos
  - Listar usuário
  - Apagar
  - Alterar
- [Avaliar](#avaliar-game)
  - Listar todos
  - Apagar
  - Alterar

### Cadastrar Usúario

#### `POST` /lobbit/api/usuarios

| campo               | tipo  | obrigatório | descrição                           |
| ------------------- | ----- | ----------- | ----------------------------------- |
| email               | texto | true        | é o email de cadastro do usuário    |
| nome                | texto | true        | é o nome completo do usuário        |
| senha               | texto | true        | é a senha de acesso do usuário      |
| nickname            | texto | true        | é o apelido do usuário              |
| data                | date  | true        | é data de cadastro do usuário       |
| plataformaPreferida | texto | false       | é a plataforma preferida do usuário |
| jogoPreferido       | texto | false       | é o jogo preferido do usuário       |
| descricaoPlayer     | texto | false       | É a descrição do usuário            |

#### Exemplo corpo da requisição

```javascript
{
    "email" : "bann@hotmail.com",
    "nome" : "Davi Oliveira da Silva",
    "senha" : "ADKJSALKDKLSAJD8SADU83MDKSLAFJ",
    "nickname" : "meliodasKiller",
    "data" : "10/12/2022",
    "plataformaPreferida": "",
    "jogoPreferido" : "",
    "descricaoPlayer" : "",
    }
}
```

#### Códigos de resposta

| código | descrição                                |
| ------ | ---------------------------------------- |
| 201    | usuário cadastrado com sucesso           |
| 400    | erro na validação do corpo da requisição |

---

### Listar usuários

`GET` /lobbit/api/usuarios

#### Exemplo de resposta da requisição

``` javascript
 [
}
    "email" : "bann@hotmail.com",
    "nome" : "Davi Oliveira da Silva",
    "senha" : "ADKJSALKDKLSAJD8SADU83MDKSLAFJ",
    "nickname" : "meliodasKiller",
    "data" : "02/05/2022",
    "plataformaPreferida": "",
    "jogoPreferido" : "",
    "descricaoPlayer" : "",    
},
}
    "email" : "bannaa@hotmail.com",
    "nome" : "Chris Oliveira da Silva",
    "senha" : "ADKJSALKDKLSAJD8SADU83MDKSLAFJ",
    "nickname" : "Shelby",
    "data" : "18/04/2022",
    "plataformaPreferida": "",
    "jogoPreferido" : "",
    "descricaoPlayer" : "",    
}
	]
```

#### Códigos de resposta

| código | descrição                       |
| ------ | ------------------------------- |
| 200    | Ok                              |
| 400    | erro na validação da requisição |

---

### Listar Usuário

`GET` /lobbit/api/usuarios/{id}

#### Exemplo de resposta da requisição

``` javascript
{
    "email" : "bann@hotmail.com",
    "nome" : "Davi Oliveira da Silva",
    "senha" : "ADKJSALKDKLSAJD8SADU83MDKSLAFJ",
    "nickname" : "meliodasKiller",
    "plataformaPreferida": "",
    "jogoPreferido" : "",
    "descricaoPlayer" : "",
}
```

#### Códigos de resposta

| código | descrição                       |
| ------ | ------------------------------- |
| 200    | Ok                              |
| 400    | erro na validação da requisição |

---

### Apagar usuário

`DELETE` /lobbit/api/usuarios/{id}

#### Códigos de resposta

| código | descrição                       |
| ------ | ------------------------------- |
| 200    | Ok                              |
| 400    | erro na validação da requisição |

---

### Alterar usuário

`PUT` /lobbit/api/usuarios/{id}

#### Exemplo de resposta da requisição

``` javascript
}
     "email" : "bann@hotmail.com",
     "nome" : "Davi Silva",
     "senha" : "ADKJSALKDKLSAJD8SADU83MDKSLAFJ",
     "nickname" : "CHUPExxx",
     "plataformaPreferida": "PS4",
     "jogoPreferido" : "The last of Us",
      "descricaoPlayer" : "Um player sagaz com vontade de ser o melhor.",
    }    
```

#### Códigos de resposta

| código | descrição                              |
| ------ | -------------------------------------- |
| 200    | Quando o recurso é editado com sucesso |
| 400    | erro na validação da requisição        |





### Avaliação

#### `POST` /lobbit/api/avalicao

| campo     | tipo  | obrigatório | descrição                                      |
| --------- | ----- | ----------- | ---------------------------------------------- |
| avaliacao | texto | false       | é a avaliação do usuário                       |
| star      | int   | true        | quandidade de estrela de 0-5 que avalia o jogo |
| data      | data  | true        | registra a data da availiação                  |

#### Exemplo corpo da requisição

```javascript
{
    "avalicao" : "rapaz o jogo e bom só que ate agora ainda sou noob nele mais um dia me torno um veterano nele só vai 	demorar mais algumas horas kkkkkk mas tirando isso o jogo e top demais trilha sonora efeitos e mecanicas tudo e muito bem feito alem e claro de ser super leve.", 
    "qtd_star" : "5"
    "data" : "24/08/2002"
}
```

#### Códigos de resposta

| código | descrição                                |
| ------ | ---------------------------------------- |
| 201    | avaliação postada com sucesso            |
| 400    | erro na validação do corpo da requisição |

---

### Listar avaliações

`GET` /lobbit/api/avaliacao

```javascript
	[
}
        "avalicao" : "jogo top joguei por muito tempo, divertido", 
        "qtd_star" : "4"
        "data" : "24/08/2002"
	}
},	
{    
        "avalicao" : "Um dos únicos mmo's que respeitam o seu tempo e dinheiro..", 
        "qtd_star" : "5"
   	"data" : "14/03/2001"
}
	]

```

#### Códigos de resposta

| código | descrição                                     |
| ------ | --------------------------------------------- |
| 200    | Ok                                            |
| 404    | não foi encontrada despesa com o id informado |

---

### Listar avaliações

`GET` /lobbit/api/avaliacao/{id}

```javascript
    {
        "avalicao" : "jogo top joguei por muito tempo, divertido", 
        "qtd_star" : "4"
        "data" : "24/08/2002"
    }
```

#### Códigos de resposta

| código | descrição                                     |
| ------ | --------------------------------------------- |
| 200    | Ok                                            |
| 404    | não foi encontrada despesa com o id informado |

---

### Alterar

`PUT` /lobbit/api/avaliacao{id}

```javascript
	[
}
        "avalicao" : "jogo bom demais", 
        "qtd_star" : "5"
        "data" : "24/08/2002"
	}
};	
```

| código | descrição                                 |
| ------ | ----------------------------------------- |
| 200    | Ok                                        |
| 400    | erro na validação dos dados da requisição |

### Deletar Avaliação

`delete`/lobbit/api/avaliacao{id}

| código | descrição                                 |
| ------ | ----------------------------------------- |
| 200    | Ok                                        |
| 400    | erro na validação dos dados da requisição |
