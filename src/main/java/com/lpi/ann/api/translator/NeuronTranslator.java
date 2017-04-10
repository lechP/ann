package com.lpi.ann.api.translator;

import com.lpi.ann.api.dto.DendriteDTO;
import com.lpi.ann.api.dto.NeuronDTO;
import com.lpi.ann.neuralnet.Neuron;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NeuronTranslator {

    public NeuronDTO serialize(Neuron neuron) {
        NeuronDTO result = new NeuronDTO();
        result.setNumberOfInputs(neuron.getInputsCount());
        List<DendriteDTO> dendrites = new ArrayList<>();
        for (int i = 0; i < neuron.getInputsCount(); i++) {
            dendrites.add(DendriteDTO.builder().input(neuron.getInput(i)).weight(neuron.getWeight(i)).build());
        }
        result.setDendrites(dendrites);
        result.setBiasDendrite(DendriteDTO.builder().input(neuron.getBias()).weight(neuron.getBiasWeight()).build());
        return result;
    }

}
