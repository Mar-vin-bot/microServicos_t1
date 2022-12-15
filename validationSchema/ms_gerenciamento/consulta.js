use clinica;

db.createCollection("consulta", {
    validator: {
        $jsonSchema: {
            required: ["nomePac", "nomeMed", "dtColsulta", "action"],
            properties: {
                nomePac: {
                    bsonType: "string",
                    description: "nome do paciente"
                },
                nomeMed: {
                    bsonType: "string",
                    maxLength: 8,
                    description: "nome medico"
                },
                dtColsulta: {
                    bsonType: "string",
                    maxLength: 10,
                    description: "data da consulta"
                },
                action: {
                    bsonType: ["object"],
                    description: "status da consulta"
                }
            }
        }
    }
})

