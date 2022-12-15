use clinica;

db.createCollection("agendamento",
    {
        validator: {
            $jsonSchema: {
                required: [
                    "dataConsulta",
                    "nomeMedico",
                    "especialidadeMedico",
                    "action"
                ], properties: {
                    dataConsulta: {
                        bsonType: "string", maxLength: 10, description: "Data da consulta."
                    }, nomeMedico: {
                        bsonType: "string", maxLength: 30, description: "Nome do medico.",
                        }, especialidadeMedico:{
                            bsonType: "string", maxLength: 30, description: "Especialidade.",
                            }, action:{
                                bsonType: ["object"], description: "Ação.",
                            }
                        }
                    }
                }
            });





;