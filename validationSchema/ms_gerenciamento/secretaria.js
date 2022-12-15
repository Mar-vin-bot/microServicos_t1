use clinica;

db.createCollection("secretaria", {
    validator: {
        $jsonSchema: {
            required: ["nomeSec", "cpf", "especialidade", "dtNasci", "action"],
            properties: {
                nomeSec: {
                    bsonType: "string",
                    description: "nome do secretaria"
                },
                cpf: {
                    bsonType: "string",
                    maxLength: 11,
                    description: "cpf da secretaria"
                },
                especialidade: {
                    bsonType: "string",
                    maxLength: 30,
                    description: "especialidade do medico"
                },
                dtNasci: {
                    bsonType: "string",
                    maxLength: 10,
                    description: "data de nascimento"
                },
            }, action: {
                bsonType: "string", description: "status da consulta",
            }
        }
    }
})
