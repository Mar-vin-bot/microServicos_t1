use clinica;

db.createCollection("logAgendamento",
    {
        validator: {
            $jsonSchema: {
                required: [
                    "dataConsulta",
                    "nomeMedico",
                    "especialidadeMedico",
                ], properties: {
                    dataConsulta: {
                        bsonType: "string", maxLength: 10, description: "Data da consulta."
                    }, nomeMedico: {
                        bsonType: "string", maxLength: 30, description: "Nome do medico.",
                    }, especialidadeMedico: {
                        bsonType: "string", maxLength: 30, description: "Especialidade.",

                    }
                }
            }
        }
    });

