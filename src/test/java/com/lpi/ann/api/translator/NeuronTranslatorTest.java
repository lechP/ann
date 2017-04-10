package com.lpi.ann.api.translator;

import static org.assertj.core.api.Assertions.assertThat;

import com.lpi.ann.api.dto.NeuronDTO;
import com.lpi.ann.neuralnet.Neuron;
import org.junit.Before;
import org.junit.Test;

public class NeuronTranslatorTest {

    private NeuronTranslator sut;

    @Before
    public void setUp() {
        sut = new NeuronTranslator();
    }

    @Test
    public void shouldCopyWeightsAndInputs() {
        //given
        Neuron input = new Neuron(1, null);
        //when
        NeuronDTO result = sut.serialize(input);
        //then
        assertThat(result.getNumberOfInputs()).isEqualTo(1);
        assertThat(result.getDendrites()).hasSize(1);
        assertThat(result.getBiasDendrite().getInput()).isEqualTo(1);
    }

}