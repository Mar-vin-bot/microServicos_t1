use clinica;

db.createCollection("logMedico", {
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
            }, agendamento: {
                bsonType: "array", description: "agedamentos do medico", minItems: 1,
            }
        }
    }
})



