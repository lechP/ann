package com.lpi.ann.api;

import com.lpi.ann.api.dto.NeuronDTO;
import com.lpi.ann.api.translator.NeuronTranslator;
import com.lpi.ann.neuralnet.Neuron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/neuron")
public class NeuronController {

    @Autowired
    public NeuronController(NeuronTranslator neuronTranslator) {
        this.neuronTranslator = neuronTranslator;
    }

    private NeuronTranslator neuronTranslator;

    @RequestMapping(method = RequestMethod.GET)
    public NeuronDTO greeting(@RequestParam(value = "numberOfInputs") int numberOfInputs) {
        Neuron neuron = new Neuron(numberOfInputs, null);
        neuron.setInputs(createStubInputs(numberOfInputs));
        return neuronTranslator.serialize(neuron);
    }

    private double[] createStubInputs(int numberOfInputs) {
        double[] result = new double[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            result[i] = i + 1;
        }
        return result;
    }


}
