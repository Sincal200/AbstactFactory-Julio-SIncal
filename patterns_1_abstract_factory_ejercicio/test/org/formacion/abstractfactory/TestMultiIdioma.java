package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

//import com.sun.tools.javac.tree.JCTree.Factory;

public class TestMultiIdioma {

	Abstract_Factory factory;

	@Test
	public void test_es() {
		//implementar Abstract factory
		factory = new Factory_ES();
		Preguntas preguntas = factory.createPreguntas();

		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = factory.createSaludos();

		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}

	@Test
	public void test_en() {
		//implementar Abstract factor

		factory = new Factory_EN();
		Preguntas preguntas = factory.createPreguntas();

		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );

		//implementar Abstract factor
		Saludos saludos = factory.createSaludos();

		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}

