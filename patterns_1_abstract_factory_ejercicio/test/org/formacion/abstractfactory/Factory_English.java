package org.formacion.abstractfactory;

public class Factory_English extends Factory
{
    public Preguntas preguntas() {
        return new PreguntasEn();
    }

    public Saludos saludos() {
        return new SaludosEn();
    }
}

