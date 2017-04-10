package com.lpi.ann.api;

import com.lpi.ann.api.dto.NeuronDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/neuron")
public class NeuronController {

    @RequestMapping(method = RequestMethod.GET)
    public NeuronDTO greeting(@RequestParam(value="numberOfInputs") int numberOfInputs,
            @RequestParam(value = "name", defaultValue = "World") String name) {
        NeuronDTO result = new NeuronDTO();
        result.setName(name);
        result.setNumberOfInputs(numberOfInputs);
        return result;
    }



}
