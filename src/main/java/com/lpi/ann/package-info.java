package com.lpi.ann;

/**
 * TODO
 *
 * Story #1. As an APP_USER I want to create neuron with given number of inputs and get basic information about it.
 *
 * Tasks:
 * 1. Create NeuronController with rest endpoint with query param $inputsCount
 * 2. Create NeuronDTO and DendriteDTO with input and weight fields (use lombok)
 * 3. Create NeuronTranslator to serialize Neuron into NeuronDTO
 * 4. TDD implement serialization method
 * 5. Inside Controller create neuron, set some inputs and return data to the view
 *
 *
 * Story #2. As an NN_ADEPT I want to learn about book's codebase.
 *
 * Tasks:
 * 1. The NeuralLayer class (01:09 mins)
 * 2. The ActivationFunction interface (01:09 mins)
 * 3. The neural network class (02:18 mins)
 * 4. Manage to run that shit
 * 5. Time to play! (01:09 mins)
 * 6. Summary (01:09 mins)
 *
 * BACKLOG
 *
 * Story #3. As an APP_USER I want to set input and see the output value for neuron (use identity activation function for now)
 */