use clinica;

db.createCollection("paciente", {
    validator: {
        $jsonSchema: {
            required: ["nomePac", "tel", "dtNasci", "ocupacao", "consulta"],
            properties: {
                nomePac: {
                    bsonType: "string",
                    description: "nome do paciente"
                },
                tel: {
                    bsonType: "string",
                    maxLength: 11,
                    description: "telefone do paciente"
                },
                dtNasci: {
                    bsonType: "string",
                    maxLength: 10,
                    description: "'data de nascimento do paciente"
                },
                ocupacao: {
                    bsonType: "string",
                    maxLength: 30,
                    description: "ocupação do paciente"
                },
            }, consulta: {
                bsonType: "array", description: "consultas do paciente.", minItems: 1,
            }
        }
    }
})


