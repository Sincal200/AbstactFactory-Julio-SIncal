package org.formacion.abstractfactory;

public class Factory_ES extends Abstract_Factory {

    @Override
    public Preguntas createPreguntas() {
        // TODO Auto-generated method stub
        return new PreguntasEs();
    }

    @Override
    public Saludos createSaludos() {
        // TODO Auto-generated method stub
        return new SaludosEs();
    }
}
