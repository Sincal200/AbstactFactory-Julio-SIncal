package org.formacion.abstractfactory;

public class Factory_Spanish extends Factory
{
    public Preguntas preguntas() {
        return new PreguntasEs();
    }

    public Saludos saludos() {
        return new SaludosEs();
    }
}
