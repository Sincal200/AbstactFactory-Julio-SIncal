package org.formacion.abstractfactory;

public class Factory_EN extends Abstract_Factory {
    @Override
    public Preguntas createPreguntas() {
        // TODO Auto-generated method stub
        return new PreguntasEn();
    }

    @Override
    public Saludos createSaludos() {
        // TODO Auto-generated method stub
        return new SaludosEn();
    }
}
