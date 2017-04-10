package com.lpi.ann.api.dto;

import java.util.List;
import lombok.Data;

@Data
public class NeuronDTO {

    private int numberOfInputs;
    private List<DendriteDTO> dendrites;
    private DendriteDTO biasDendrite;

}
