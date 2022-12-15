use clinica;

db.createCollection("logMedico", {
    validator: {
        $jsonSchema: {
            required: ["nomePac", "nomeMed", "dtColsulta"],
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
                }
            }
        }
    }
})

