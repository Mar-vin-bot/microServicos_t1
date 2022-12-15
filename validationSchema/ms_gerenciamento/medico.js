use clinica;

db.createCollection("medico", {
    validator: {
        $jsonSchema: {
            required: ["nomeMed", "crm", "especialidade", "turnoAtendimento", "agendamento"],
            properties: {
                nomeMed: {
                    bsonType: "string",
                    description: "nome do medico"
                },
                crm: {
                    bsonType: "string",
                    maxLength: 8,
                    description: "crm do medico"
                },
                especialidade: {
                    bsonType: "string",
                    maxLength: 30,
                    description: "especialidade do medico"
                },
                turnoAtendimento: {
                    bsonType: "string",
                    maxLength: 8,
                    description: "turno de atendimento"
                },
            }, action: {
                bsonType: "string", description: "status da consulta",
            }
        }
    }
})

